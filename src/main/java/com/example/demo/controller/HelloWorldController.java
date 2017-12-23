package com.example.demo.controller;

import com.example.demo.domain.StockTest;
import com.example.demo.service.StockTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    StockTestService stockTestService;

    @RequestMapping("/hello")
    public String hello(){
        List<StockTest> list = stockTestService.findAll();
        return "hello world haha "+list.toString();
    }
}
