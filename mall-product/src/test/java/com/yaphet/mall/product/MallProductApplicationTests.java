package com.yaphet.mall.product;

import com.yaphet.mall.product.entity.BrandEntity;
import com.yaphet.mall.product.service.BrandService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brand = new BrandEntity();
        brand.setName("华为");
        brandService.save(brand);
    }


    @Test
    void select() {

        List<BrandEntity> list = brandService.list();
        list.stream().forEach(e-> System.out.println(e));
    }

}
