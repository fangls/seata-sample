package com.example.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @RequestMapping("/purchase")
    public Boolean purchase(String userId,String commodityCode, Integer orderCount){
        businessService.purchase(userId, commodityCode,orderCount);
        return true;
    }
}
