package com.cs4.appointmentManagement.dao;

import com.cs4.appointmentManagement.domain.User;
import com.cs4.appointmentManagement.domain.UserCredentials;

public interface UserCredentialsDao extends GenericDao<UserCredentials> {
	public UserCredentials findByUsername(String username);
}
