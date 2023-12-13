package com.bookmyshow.authservice.builder;

import com.bookmyshow.authservice.dto.UserDTO;
import com.bookmyshow.authservice.model.User;
import org.springframework.stereotype.Component;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Component
public class ResponseBuilder {
    public UserDTO buildUserDtoFromCreatedUser(User createdUser) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(createdUser.getUserId());
        userDTO.setName(createdUser.getName());
        userDTO.setEmail(createdUser.getEmail());
        userDTO.setPhone(createdUser.getPhone());
        return userDTO;
    }
}
