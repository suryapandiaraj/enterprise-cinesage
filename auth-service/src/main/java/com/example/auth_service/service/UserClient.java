package com.example.auth_service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.auth_service.dto.UserRequest;

@FeignClient(name = "user-service")
public interface UserClient {
    
    @PostMapping("/api/user")
    void createUser (UserRequest userRequest);
}
