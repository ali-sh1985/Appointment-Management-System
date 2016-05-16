package com.cs4.appointmentManagement.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.GenericDao;

@Repository
public class GenericDaoImpl<T> implements GenericDao<T>{

	@PersistenceContext
	protected EntityManager entityManager;
	
	protected Class<T> daoType;
	
	public void setDaoType(Class<T> daoType) {
		this.daoType = daoType;
	}

	@Override
	public void save(T t) {
		entityManager.persist(t);
	}
	
	public void delete(T t) {
		entityManager.remove(t);
	}

	@Override
	public void delete(Long id) {
		T entity = findOne(id);
		delete(entity);
	}

	@Override
	public T findOne(Long id) {
		return (T) entityManager.find(daoType, id);
	}

	@Override
	public T update(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
