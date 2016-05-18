package com.cs4.appointmentManagement.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.UserCredentialsDao;
import com.cs4.appointmentManagement.domain.Authority;
import com.cs4.appointmentManagement.domain.UserCredentials;

@Repository
public class UserCredentialsDaoImpl extends GenericDaoImpl<UserCredentials> implements UserCredentialsDao{
	public UserCredentialsDaoImpl() {
		super.setDaoType(UserCredentials.class);
	}
	
	@Override
	public void save(UserCredentials uc) {
		entityManager.persist(uc);
	}

	@Override
	public UserCredentials findByUsername(String username) {
		Query query = entityManager.createQuery("SELECT u FROM "+daoType.getName()+" u INNER JOIN u.authority a WHERE "
				+ "u.userName = :username)");
		query.setParameter("username", username);
		return (UserCredentials) query.getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Authority> getAllAuthorities() {
		Query query = entityManager.createQuery("SELECT a FROM Authority a WHERE a.authority != :role");
		return (List<Authority>) query.setParameter("role","ROLE_ADMIN").getResultList();
		
	}
	
}
