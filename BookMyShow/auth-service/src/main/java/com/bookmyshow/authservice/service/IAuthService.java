package com.bookmyshow.authservice.service;

import com.bookmyshow.authservice.dto.SignupRequest;
import com.bookmyshow.authservice.dto.UserDTO;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
public interface IAuthService {
    UserDTO createUser(SignupRequest signupRequest);
}
