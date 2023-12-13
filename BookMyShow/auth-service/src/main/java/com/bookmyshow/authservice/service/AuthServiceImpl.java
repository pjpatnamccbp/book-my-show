package com.bookmyshow.authservice.service;

import com.bookmyshow.authservice.builder.RequestBuilder;
import com.bookmyshow.authservice.builder.ResponseBuilder;
import com.bookmyshow.authservice.dao.IUserRepository;
import com.bookmyshow.authservice.dto.SignupRequest;
import com.bookmyshow.authservice.dto.UserDTO;
import com.bookmyshow.authservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Service
public class AuthServiceImpl implements IAuthService{
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private RequestBuilder requestBuilder;
    @Autowired
    private ResponseBuilder responseBuilder;

    @Override
    public UserDTO createUser(SignupRequest signupRequest) {
        User createdUser = userRepository.save(requestBuilder.buildUserFromSignupRequest(signupRequest));

        return responseBuilder.buildUserDtoFromCreatedUser(createdUser);
    }
}
