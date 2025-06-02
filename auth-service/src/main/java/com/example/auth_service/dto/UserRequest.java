package com.example.auth_service.dto;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class UserRequest {
    private String name;
    private String email;
    private String role;
}
