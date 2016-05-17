package com.cs4.appointmentManagement.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.UserDao;
import com.cs4.appointmentManagement.domain.User;

@Repository
public class UseDaoImpl extends GenericDaoImpl<User> implements UserDao{
	public UseDaoImpl() {
		super.setDaoType(User.class);
	}

	@Override
	public User findByUsername(String username) {
		Query query = entityManager.createQuery("SELECT u FROM "+daoType.getName()+" u INNER JOIN u.userCredentials c WHERE "
				+ "c.userName = :username)");
		query.setParameter("username", username);
		return (User) query.getSingleResult();
	}
}
