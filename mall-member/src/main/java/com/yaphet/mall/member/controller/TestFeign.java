package com.yaphet.mall.member.controller;

import com.yaphet.mall.common.utils.R;
import com.yaphet.mall.member.feign.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wuyfk
 * @Date: 2024/3/11 10:58
 * @Description:
 */

@RestController
@RequestMapping("member/testFeign")
public class TestFeign {
    @Autowired
    private OrderService orderService;

    /**
     * 列表
     */
    @RequestMapping("/listAll")
    public R listAll(){
        return orderService.listAll();
    }
}
