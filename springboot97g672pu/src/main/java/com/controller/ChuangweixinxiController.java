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

import com.entity.ChuangweixinxiEntity;
import com.entity.view.ChuangweixinxiView;

import com.service.ChuangweixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 床位信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
@RestController
@RequestMapping("/chuangweixinxi")
public class ChuangweixinxiController {
    @Autowired
    private ChuangweixinxiService chuangweixinxiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChuangweixinxiEntity chuangweixinxi,
		HttpServletRequest request){
        EntityWrapper<ChuangweixinxiEntity> ew = new EntityWrapper<ChuangweixinxiEntity>();

		PageUtils page = chuangweixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chuangweixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChuangweixinxiEntity chuangweixinxi, 
		HttpServletRequest request){
        EntityWrapper<ChuangweixinxiEntity> ew = new EntityWrapper<ChuangweixinxiEntity>();

		PageUtils page = chuangweixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chuangweixinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChuangweixinxiEntity chuangweixinxi){
       	EntityWrapper<ChuangweixinxiEntity> ew = new EntityWrapper<ChuangweixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chuangweixinxi, "chuangweixinxi")); 
        return R.ok().put("data", chuangweixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChuangweixinxiEntity chuangweixinxi){
        EntityWrapper< ChuangweixinxiEntity> ew = new EntityWrapper< ChuangweixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chuangweixinxi, "chuangweixinxi")); 
		ChuangweixinxiView chuangweixinxiView =  chuangweixinxiService.selectView(ew);
		return R.ok("查询床位信息成功").put("data", chuangweixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChuangweixinxiEntity chuangweixinxi = chuangweixinxiService.selectById(id);
        return R.ok().put("data", chuangweixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChuangweixinxiEntity chuangweixinxi = chuangweixinxiService.selectById(id);
        return R.ok().put("data", chuangweixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChuangweixinxiEntity chuangweixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chuangweixinxi);
        chuangweixinxiService.insert(chuangweixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChuangweixinxiEntity chuangweixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chuangweixinxi);
        chuangweixinxiService.insert(chuangweixinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChuangweixinxiEntity chuangweixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chuangweixinxi);
        chuangweixinxiService.updateById(chuangweixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chuangweixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
