package com.bookmyshow.authservice.builder;

import com.bookmyshow.authservice.dto.SignupRequest;
import com.bookmyshow.authservice.model.User;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Component
public class RequestBuilder {
    public User buildUserFromSignupRequest(SignupRequest signupRequest) {
        User user = new User();
        user.setName(signupRequest.getName());
        user.setPhone(signupRequest.getPhone());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
        return user;
    }
}
