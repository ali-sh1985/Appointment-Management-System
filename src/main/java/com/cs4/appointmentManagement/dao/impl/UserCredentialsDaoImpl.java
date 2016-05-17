package com.cs4.appointmentManagement.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.UserCredentialsDao;
import com.cs4.appointmentManagement.domain.User;
import com.cs4.appointmentManagement.domain.UserCredentials;

@Repository
public class UserCredentialsDaoImpl extends GenericDaoImpl<UserCredentials> implements UserCredentialsDao{
	public UserCredentialsDaoImpl() {
		super.setDaoType(UserCredentials.class);
	}

	@Override
	public UserCredentials findByUsername(String username) {
		Query query = entityManager.createQuery("SELECT u FROM "+daoType.getName()+" u INNER JOIN u.authority a WHERE "
				+ "u.userName = :username)");
		query.setParameter("username", username);
		return (UserCredentials) query.getSingleResult();
	}
}
