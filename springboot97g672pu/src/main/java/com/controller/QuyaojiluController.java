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

import com.entity.QuyaojiluEntity;
import com.entity.view.QuyaojiluView;

import com.service.QuyaojiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 取药记录
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
@RestController
@RequestMapping("/quyaojilu")
public class QuyaojiluController {
    @Autowired
    private QuyaojiluService quyaojiluService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QuyaojiluEntity quyaojilu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			quyaojilu.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huanzhe")) {
			quyaojilu.setHuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QuyaojiluEntity> ew = new EntityWrapper<QuyaojiluEntity>();

		PageUtils page = quyaojiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quyaojilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QuyaojiluEntity quyaojilu, 
		HttpServletRequest request){
        EntityWrapper<QuyaojiluEntity> ew = new EntityWrapper<QuyaojiluEntity>();

		PageUtils page = quyaojiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quyaojilu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QuyaojiluEntity quyaojilu){
       	EntityWrapper<QuyaojiluEntity> ew = new EntityWrapper<QuyaojiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( quyaojilu, "quyaojilu")); 
        return R.ok().put("data", quyaojiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QuyaojiluEntity quyaojilu){
        EntityWrapper< QuyaojiluEntity> ew = new EntityWrapper< QuyaojiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( quyaojilu, "quyaojilu")); 
		QuyaojiluView quyaojiluView =  quyaojiluService.selectView(ew);
		return R.ok("查询取药记录成功").put("data", quyaojiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QuyaojiluEntity quyaojilu = quyaojiluService.selectById(id);
        return R.ok().put("data", quyaojilu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QuyaojiluEntity quyaojilu = quyaojiluService.selectById(id);
        return R.ok().put("data", quyaojilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QuyaojiluEntity quyaojilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(quyaojilu);
        quyaojiluService.insert(quyaojilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QuyaojiluEntity quyaojilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(quyaojilu);
        quyaojiluService.insert(quyaojilu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QuyaojiluEntity quyaojilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quyaojilu);
        quyaojiluService.updateById(quyaojilu);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<QuyaojiluEntity> list = new ArrayList<QuyaojiluEntity>();
        for(Long id : ids) {
            QuyaojiluEntity quyaojilu = quyaojiluService.selectById(id);
            quyaojilu.setSfsh(sfsh);
            quyaojilu.setShhf(shhf);
            list.add(quyaojilu);
        }
        quyaojiluService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        quyaojiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
