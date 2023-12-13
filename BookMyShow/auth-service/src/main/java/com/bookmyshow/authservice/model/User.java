package com.bookmyshow.authservice.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author hp ON 25-10-2023
 * @Description
 **/
@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String email;
    private String password;
    private String phone;
}
