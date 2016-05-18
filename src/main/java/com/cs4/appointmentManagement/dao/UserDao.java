package com.cs4.appointmentManagement.dao;

import java.util.List;

import com.cs4.appointmentManagement.domain.User;

public interface UserDao extends GenericDao<User> {
	public User findByUsername(String username);
	public List<User> search(String name);
}
