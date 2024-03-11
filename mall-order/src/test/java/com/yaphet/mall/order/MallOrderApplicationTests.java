package com.yaphet.mall.order;

import com.yaphet.mall.order.entity.OrderEntity;
import com.yaphet.mall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallOrderApplicationTests {
    @Autowired
    private OrderService orderService;

    @Test
    void contextLoads() {
        OrderEntity order = new OrderEntity();
        order.setBillContent("12121");
        orderService.save(order);

    }

}
