package com.example.skahelmdemo.controller;

import com.example.skahelmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/{name}")
    public void add(@PathVariable String name) {
        userService.add(name);
    }

    @GetMapping
    public List<String> check() {
        return userService.check();
    }
}
