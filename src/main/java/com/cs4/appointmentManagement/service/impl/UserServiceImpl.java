package com.cs4.appointmentManagement.service.impl;

import org.springframework.stereotype.Component;

import com.cs4.appointmentManagement.domain.User;
import com.cs4.appointmentManagement.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Override
	public User findByUsername(String username) {
		return null;
	}

}
