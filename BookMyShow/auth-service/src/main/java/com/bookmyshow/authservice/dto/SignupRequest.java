package com.bookmyshow.authservice.dto;

import lombok.Data;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Data
public class SignupRequest {
    private String name;
    private String email;
    private String phone;
    private String password;
}
