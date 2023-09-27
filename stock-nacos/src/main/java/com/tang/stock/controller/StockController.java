package com.tang.stock.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangzhipeng
 * @project springboot-2023
 * @description:
 * @date 2023/9/26 14:52
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/reduce")
    public String reduce(){
        System.out.println("扣减库存");
        return "扣减库存"+port;
    }

}
