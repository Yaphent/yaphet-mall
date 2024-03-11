package com.yaphet.mall.member.feign;

import com.yaphet.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wuyfk
 * @Date: 2024/3/11 10:41
 * @Description:
 */
@FeignClient(name = "mall-order")
public interface  OrderService {
    @RequestMapping("order/order/listAll")
    public R listAll();
}
