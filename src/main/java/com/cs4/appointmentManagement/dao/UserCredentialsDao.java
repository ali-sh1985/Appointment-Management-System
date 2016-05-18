package com.cs4.appointmentManagement.dao;

import java.util.List;

import com.cs4.appointmentManagement.domain.Authority;
import com.cs4.appointmentManagement.domain.User;
import com.cs4.appointmentManagement.domain.UserCredentials;

public interface UserCredentialsDao extends GenericDao<UserCredentials> {
	public UserCredentials findByUsername(String username);
	public List<Authority> getAllAuthorities();
}
