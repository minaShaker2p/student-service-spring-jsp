package com.mina.studentservice.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userId, String password) {
        return userId.equalsIgnoreCase("test")
                && password.equalsIgnoreCase("test1234");
    }
}
