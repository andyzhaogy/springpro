package com.csljc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// LoginController.java
@Controller
@EnableAutoConfiguration
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String username, @RequestParam String password) {
        // 这里可以加入登录验证的逻辑，例如查询数据库等
        logger.info("Attempting login for user: {}", username);
        if ("user".equals(username) && "password".equals(password)) {
            return "redirect:success";
        } else {
            logger.warn("Login failed for user: {}", username);
            return "redirect:error";
        }
    }

    @GetMapping("/success")
    public String success() {
        return "success";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
