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

import com.entity.GuahaoquxiaoEntity;
import com.entity.view.GuahaoquxiaoView;

import com.service.GuahaoquxiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 挂号取消
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 14:38:28
 */
@RestController
@RequestMapping("/guahaoquxiao")
public class GuahaoquxiaoController {
    @Autowired
    private GuahaoquxiaoService guahaoquxiaoService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuahaoquxiaoEntity guahaoquxiao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			guahaoquxiao.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huanzhe")) {
			guahaoquxiao.setHuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GuahaoquxiaoEntity> ew = new EntityWrapper<GuahaoquxiaoEntity>();

		PageUtils page = guahaoquxiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guahaoquxiao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuahaoquxiaoEntity guahaoquxiao, 
		HttpServletRequest request){
        EntityWrapper<GuahaoquxiaoEntity> ew = new EntityWrapper<GuahaoquxiaoEntity>();

		PageUtils page = guahaoquxiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guahaoquxiao), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuahaoquxiaoEntity guahaoquxiao){
       	EntityWrapper<GuahaoquxiaoEntity> ew = new EntityWrapper<GuahaoquxiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guahaoquxiao, "guahaoquxiao")); 
        return R.ok().put("data", guahaoquxiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuahaoquxiaoEntity guahaoquxiao){
        EntityWrapper< GuahaoquxiaoEntity> ew = new EntityWrapper< GuahaoquxiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guahaoquxiao, "guahaoquxiao")); 
		GuahaoquxiaoView guahaoquxiaoView =  guahaoquxiaoService.selectView(ew);
		return R.ok("查询挂号取消成功").put("data", guahaoquxiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GuahaoquxiaoEntity guahaoquxiao = guahaoquxiaoService.selectById(id);
        return R.ok().put("data", guahaoquxiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GuahaoquxiaoEntity guahaoquxiao = guahaoquxiaoService.selectById(id);
        return R.ok().put("data", guahaoquxiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuahaoquxiaoEntity guahaoquxiao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guahaoquxiao);
        guahaoquxiaoService.insert(guahaoquxiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GuahaoquxiaoEntity guahaoquxiao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guahaoquxiao);
        guahaoquxiaoService.insert(guahaoquxiao);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GuahaoquxiaoEntity guahaoquxiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guahaoquxiao);
        guahaoquxiaoService.updateById(guahaoquxiao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guahaoquxiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
