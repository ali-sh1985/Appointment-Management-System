package com.cs4.appointmentManagement.dao.impl;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.UserDao;
import com.cs4.appointmentManagement.domain.User;

@Repository
public class UseDaoImpl extends GenericDaoImpl<User> implements UserDao{
	public UseDaoImpl() {
		super.setDaoType(User.class);
	}
}
