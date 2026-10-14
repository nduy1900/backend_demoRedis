package com.example.demoRedis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Cacheable("products")
    public String getProducts(){

        return "All products";
    }
}
