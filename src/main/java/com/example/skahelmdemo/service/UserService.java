package com.example.skahelmdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private RedisTemplate redisTemplate;

    public void add(String name) {
        redisTemplate.opsForList().leftPush("test", name);
    }

    public List<String> check() {
        return redisTemplate.opsForList().range("test", 0, 10);
    }
}
