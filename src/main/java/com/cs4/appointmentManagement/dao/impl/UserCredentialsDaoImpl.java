package com.cs4.appointmentManagement.dao.impl;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.UserCredentialsDao;
import com.cs4.appointmentManagement.domain.UserCredentials;

@Repository
public class UserCredentialsDaoImpl extends GenericDaoImpl<UserCredentials> implements UserCredentialsDao{
	public UserCredentialsDaoImpl() {
		super.setDaoType(UserCredentials.class);
	}
}
