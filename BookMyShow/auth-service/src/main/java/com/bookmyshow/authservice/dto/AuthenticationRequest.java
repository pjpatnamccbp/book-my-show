package com.bookmyshow.authservice.dto;

import lombok.Data;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Data
public class AuthenticationRequest {
    private String email;
    private String password;
}
