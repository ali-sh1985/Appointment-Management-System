package com.cs4.appointmentManagement.dao.impl;

import java.util.List;

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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> search(String name) {
		Query query = entityManager.createQuery("SELECT u FROM "+daoType.getName()+" u WHERE u.fname like :name OR u.lname like :name");
		query.setParameter("name", "%"+name+"%");
		return (List<User>) query.getResultList();
	}
	
	@Override
	public Long findUserID(String username){
		System.out.println("DAO impl : "+username);
		User u = (User) findByUsername(username);
		System.out.println("I GOT it : "+u.getId());
		return (Long)u.getId();
	}
	
	
}
