package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhuyuanjiluEntity;
import com.entity.view.ZhuyuanjiluView;

import com.service.ZhuyuanjiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 住院记录
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
@RestController
@RequestMapping("/zhuyuanjilu")
public class ZhuyuanjiluController {
    @Autowired
    private ZhuyuanjiluService zhuyuanjiluService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhuyuanjiluEntity zhuyuanjilu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huanzhe")) {
			zhuyuanjilu.setHuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yisheng")) {
			zhuyuanjilu.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuyuanjiluEntity> ew = new EntityWrapper<ZhuyuanjiluEntity>();

		PageUtils page = zhuyuanjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuyuanjilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhuyuanjiluEntity zhuyuanjilu, 
		HttpServletRequest request){
        EntityWrapper<ZhuyuanjiluEntity> ew = new EntityWrapper<ZhuyuanjiluEntity>();

		PageUtils page = zhuyuanjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuyuanjilu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhuyuanjiluEntity zhuyuanjilu){
       	EntityWrapper<ZhuyuanjiluEntity> ew = new EntityWrapper<ZhuyuanjiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhuyuanjilu, "zhuyuanjilu")); 
        return R.ok().put("data", zhuyuanjiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhuyuanjiluEntity zhuyuanjilu){
        EntityWrapper< ZhuyuanjiluEntity> ew = new EntityWrapper< ZhuyuanjiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhuyuanjilu, "zhuyuanjilu")); 
		ZhuyuanjiluView zhuyuanjiluView =  zhuyuanjiluService.selectView(ew);
		return R.ok("查询住院记录成功").put("data", zhuyuanjiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhuyuanjiluEntity zhuyuanjilu = zhuyuanjiluService.selectById(id);
        return R.ok().put("data", zhuyuanjilu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhuyuanjiluEntity zhuyuanjilu = zhuyuanjiluService.selectById(id);
        return R.ok().put("data", zhuyuanjilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhuyuanjiluEntity zhuyuanjilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhuyuanjilu);
        zhuyuanjiluService.insert(zhuyuanjilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhuyuanjiluEntity zhuyuanjilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhuyuanjilu);
        zhuyuanjiluService.insert(zhuyuanjilu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhuyuanjiluEntity zhuyuanjilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhuyuanjilu);
        zhuyuanjiluService.updateById(zhuyuanjilu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhuyuanjiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
