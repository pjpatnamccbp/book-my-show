package com.bookmyshow.authservice.controller;

import com.bookmyshow.authservice.dto.SignupRequest;
import com.bookmyshow.authservice.dto.UserDTO;
import com.bookmyshow.authservice.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@RestController
//@RequestMapping
public class SignupUserController {
    @Autowired
    private IAuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> createUser(@RequestBody SignupRequest signupRequest){
        UserDTO createdUser = authService.createUser(signupRequest);
        if(createdUser == null){
            return new ResponseEntity<>("User is not created, try again later.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(createdUser,HttpStatus.CREATED);
    }
}
