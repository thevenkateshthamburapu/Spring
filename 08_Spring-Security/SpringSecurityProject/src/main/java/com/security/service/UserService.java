package com.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.security.dto.UserRegistrationDto;
import com.security.model.User;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);
}
