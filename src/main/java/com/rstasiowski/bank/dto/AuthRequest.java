package com.rstasiowski.bank.dto;

import lombok.Data;

@Data
public class AuthRequest {
    String username;
    String password;
}
