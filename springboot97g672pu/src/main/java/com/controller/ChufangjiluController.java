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

import com.entity.ChufangjiluEntity;
import com.entity.view.ChufangjiluView;

import com.service.ChufangjiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 处方记录
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
@RestController
@RequestMapping("/chufangjilu")
public class ChufangjiluController {
    @Autowired
    private ChufangjiluService chufangjiluService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChufangjiluEntity chufangjilu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			chufangjilu.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huanzhe")) {
			chufangjilu.setHuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChufangjiluEntity> ew = new EntityWrapper<ChufangjiluEntity>();

		PageUtils page = chufangjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chufangjilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChufangjiluEntity chufangjilu, 
		HttpServletRequest request){
        EntityWrapper<ChufangjiluEntity> ew = new EntityWrapper<ChufangjiluEntity>();

		PageUtils page = chufangjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chufangjilu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChufangjiluEntity chufangjilu){
       	EntityWrapper<ChufangjiluEntity> ew = new EntityWrapper<ChufangjiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chufangjilu, "chufangjilu")); 
        return R.ok().put("data", chufangjiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChufangjiluEntity chufangjilu){
        EntityWrapper< ChufangjiluEntity> ew = new EntityWrapper< ChufangjiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chufangjilu, "chufangjilu")); 
		ChufangjiluView chufangjiluView =  chufangjiluService.selectView(ew);
		return R.ok("查询处方记录成功").put("data", chufangjiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChufangjiluEntity chufangjilu = chufangjiluService.selectById(id);
        return R.ok().put("data", chufangjilu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChufangjiluEntity chufangjilu = chufangjiluService.selectById(id);
        return R.ok().put("data", chufangjilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChufangjiluEntity chufangjilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chufangjilu);
        chufangjiluService.insert(chufangjilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChufangjiluEntity chufangjilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chufangjilu);
        chufangjiluService.insert(chufangjilu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChufangjiluEntity chufangjilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chufangjilu);
        chufangjiluService.updateById(chufangjilu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chufangjiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
