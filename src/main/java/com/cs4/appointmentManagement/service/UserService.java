package com.cs4.appointmentManagement.service;


import java.util.List;

import com.cs4.appointmentManagement.domain.User;

public interface UserService {
	public User findByUsername(String username);
	public void save(User user);
	public List<User> search(String name);
	public Long findUserID(String username);
	public User findUserByID(Long id);

}
