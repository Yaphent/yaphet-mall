package com.yaphet.mall.order.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yaphet.mall.order.entity.OrderEntity;
import com.yaphet.mall.order.service.OrderService;
import com.yaphet.mall.common.utils.PageUtils;
import com.yaphet.mall.common.utils.R;



/**
 * 订单
 *
 * @author yaphet
 * @email 764136083@qq.com
 * @date 2024-03-10 16:15:23
 */
@RefreshScope
@RestController
@RequestMapping("order/order")
public class OrderController {
    @Value("${order.name}")
    private String name;
    @Value("${order.age}")
    private String age;

    @Autowired
    private OrderService orderService;

    /**
     * 列表
     */
    @RequestMapping("/listAll")
    public R listAll(){
        List<OrderEntity> list = orderService.list();

        return R.ok().put("page", list);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		OrderEntity order = orderService.getById(id);

        return R.ok().put("order", order);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrderEntity order){
		orderService.save(order);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrderEntity order){
		orderService.updateById(order);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		orderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

    @RequestMapping("/getXiaoHong")
    public R getXiaoHong(){
        return R.ok().put("name",name).put("age",age);
    }
}
