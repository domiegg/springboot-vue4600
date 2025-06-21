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

import com.entity.YuyueguahaoEntity;
import com.entity.view.YuyueguahaoView;

import com.service.YuyueguahaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 预约挂号
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 14:38:28
 */
@RestController
@RequestMapping("/yuyueguahao")
public class YuyueguahaoController {
    @Autowired
    private YuyueguahaoService yuyueguahaoService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuyueguahaoEntity yuyueguahao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			yuyueguahao.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huanzhe")) {
			yuyueguahao.setHuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuyueguahaoEntity> ew = new EntityWrapper<YuyueguahaoEntity>();

		PageUtils page = yuyueguahaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyueguahao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuyueguahaoEntity yuyueguahao, 
		HttpServletRequest request){
        EntityWrapper<YuyueguahaoEntity> ew = new EntityWrapper<YuyueguahaoEntity>();

		PageUtils page = yuyueguahaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyueguahao), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuyueguahaoEntity yuyueguahao){
       	EntityWrapper<YuyueguahaoEntity> ew = new EntityWrapper<YuyueguahaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuyueguahao, "yuyueguahao")); 
        return R.ok().put("data", yuyueguahaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuyueguahaoEntity yuyueguahao){
        EntityWrapper< YuyueguahaoEntity> ew = new EntityWrapper< YuyueguahaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuyueguahao, "yuyueguahao")); 
		YuyueguahaoView yuyueguahaoView =  yuyueguahaoService.selectView(ew);
		return R.ok("查询预约挂号成功").put("data", yuyueguahaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuyueguahaoEntity yuyueguahao = yuyueguahaoService.selectById(id);
        return R.ok().put("data", yuyueguahao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuyueguahaoEntity yuyueguahao = yuyueguahaoService.selectById(id);
        return R.ok().put("data", yuyueguahao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuyueguahaoEntity yuyueguahao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yuyueguahao);
        yuyueguahaoService.insert(yuyueguahao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuyueguahaoEntity yuyueguahao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yuyueguahao);
        yuyueguahaoService.insert(yuyueguahao);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YuyueguahaoEntity yuyueguahao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuyueguahao);
        yuyueguahaoService.updateById(yuyueguahao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuyueguahaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
