package com.example.auth_service.dto;

import lombok.Data;

@Data
public class JwtResponse {
    private String token;
    private String role;
}