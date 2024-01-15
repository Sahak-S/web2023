package com.example.web2023.service;

import com.example.web2023.dto.RegistrationDto;
import com.example.web2023.model.UserEntity;

public interface UserService {

    void saveUser(RegistrationDto registrationDto);
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);

}
