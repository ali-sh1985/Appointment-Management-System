package com.cs4.appointmentManagement.service;


import com.cs4.appointmentManagement.domain.User;

public interface UserService {
	public User findByUsername(String username);

}
