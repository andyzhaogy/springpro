package com.csljc.service;

import org.springframework.stereotype.Service;

// UserService.java
@Service
public class UserService {
    // 在实际应用中，这里可能需要查询数据库或调用其他服务进行用户验证
    public boolean isValidUser(String username, String password) {
        // 简化示例，直接比较
        return "user".equals(username) && "password".equals(password);
    }
}
