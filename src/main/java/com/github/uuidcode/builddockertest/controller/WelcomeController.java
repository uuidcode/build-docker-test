package com.github.uuidcode.builddockertest.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class WelcomeController {
    @ResponseBody
    @GetMapping("/hello")
    public Object hello() throws Exception {
        Map<String, Object> map = new HashMap<>();

        Properties properties = System.getProperties();
        map.put("properties", properties);

        Map<String, String> env = System.getenv();
        map.put("env", env);

        return map;
    }
}