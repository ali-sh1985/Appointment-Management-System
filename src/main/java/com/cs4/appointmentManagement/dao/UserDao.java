package com.cs4.appointmentManagement.dao;

import com.cs4.appointmentManagement.domain.User;

public interface UserDao extends GenericDao<User> {
	public User findByUsername(String username);
}
