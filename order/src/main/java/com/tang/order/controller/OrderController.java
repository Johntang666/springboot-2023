package com.tang.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author tangzhipeng
 * @project springboot-2023
 * @description:
 * @date 2023/9/26 14:50
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
        String forObject = restTemplate.getForObject("http://localhost:8081/stock/reduce", String.class);
        System.out.println(forObject);
        return "Hello word";
    }
}
