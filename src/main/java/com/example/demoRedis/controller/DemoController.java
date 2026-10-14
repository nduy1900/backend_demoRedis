package com.example.demoRedis.controller;

import com.example.demoRedis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class DemoController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public String test(){
        return productService.getProducts();
    }
}
