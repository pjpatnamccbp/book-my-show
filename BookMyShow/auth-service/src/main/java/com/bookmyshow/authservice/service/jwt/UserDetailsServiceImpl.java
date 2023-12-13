package com.bookmyshow.authservice.service.jwt;

import com.bookmyshow.authservice.dao.IUserRepository;
import com.bookmyshow.authservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.annotation.AccessType;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findFirstByEmailId(username);
        if(user == null){
            throw new UsernameNotFoundException("user not found");
        }
        return new SecurityProperties.User();
    }
}
