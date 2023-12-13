package com.bookmyshow.authservice.dao;

import com.bookmyshow.authservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
}
