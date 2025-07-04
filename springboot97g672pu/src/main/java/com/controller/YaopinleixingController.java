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

import com.entity.YaopinleixingEntity;
import com.entity.view.YaopinleixingView;

import com.service.YaopinleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 药品类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
@RestController
@RequestMapping("/yaopinleixing")
public class YaopinleixingController {
    @Autowired
    private YaopinleixingService yaopinleixingService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YaopinleixingEntity yaopinleixing,
		HttpServletRequest request){
        EntityWrapper<YaopinleixingEntity> ew = new EntityWrapper<YaopinleixingEntity>();

		PageUtils page = yaopinleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaopinleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YaopinleixingEntity yaopinleixing, 
		HttpServletRequest request){
        EntityWrapper<YaopinleixingEntity> ew = new EntityWrapper<YaopinleixingEntity>();

		PageUtils page = yaopinleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaopinleixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YaopinleixingEntity yaopinleixing){
       	EntityWrapper<YaopinleixingEntity> ew = new EntityWrapper<YaopinleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yaopinleixing, "yaopinleixing")); 
        return R.ok().put("data", yaopinleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YaopinleixingEntity yaopinleixing){
        EntityWrapper< YaopinleixingEntity> ew = new EntityWrapper< YaopinleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yaopinleixing, "yaopinleixing")); 
		YaopinleixingView yaopinleixingView =  yaopinleixingService.selectView(ew);
		return R.ok("查询药品类型成功").put("data", yaopinleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YaopinleixingEntity yaopinleixing = yaopinleixingService.selectById(id);
        return R.ok().put("data", yaopinleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YaopinleixingEntity yaopinleixing = yaopinleixingService.selectById(id);
        return R.ok().put("data", yaopinleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YaopinleixingEntity yaopinleixing, HttpServletRequest request){
        if(yaopinleixingService.selectCount(new EntityWrapper<YaopinleixingEntity>().eq("yaopinleixing", yaopinleixing.getYaopinleixing()))>0) {
            return R.error("药品类型已存在");
        }
    	//ValidatorUtils.validateEntity(yaopinleixing);
        yaopinleixingService.insert(yaopinleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YaopinleixingEntity yaopinleixing, HttpServletRequest request){
        if(yaopinleixingService.selectCount(new EntityWrapper<YaopinleixingEntity>().eq("yaopinleixing", yaopinleixing.getYaopinleixing()))>0) {
            return R.error("药品类型已存在");
        }
    	//ValidatorUtils.validateEntity(yaopinleixing);
        yaopinleixingService.insert(yaopinleixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YaopinleixingEntity yaopinleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yaopinleixing);
        if(yaopinleixingService.selectCount(new EntityWrapper<YaopinleixingEntity>().ne("id", yaopinleixing.getId()).eq("yaopinleixing", yaopinleixing.getYaopinleixing()))>0) {
            return R.error("药品类型已存在");
        }
        yaopinleixingService.updateById(yaopinleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yaopinleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
