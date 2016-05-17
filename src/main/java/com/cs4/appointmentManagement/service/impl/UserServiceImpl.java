package com.cs4.appointmentManagement.service.impl;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs4.appointmentManagement.dao.UserDao;
import com.cs4.appointmentManagement.domain.Speciality;
import com.cs4.appointmentManagement.domain.User;
import com.cs4.appointmentManagement.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public void save(User speciality) {
		userDao.save(speciality);
	}

	@Override
	public void delete(Long id) {
		userDao.delete(id);
	}

	@Override
	public User findOne(Long id) {
		return userDao.findOne(id);
	}

	@Override
	public User update(User user) {
		return userDao.update(user);
	}

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cs4.appointmentManagement.dao.UserDao;
import com.cs4.appointmentManagement.domain.User;
import com.cs4.appointmentManagement.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
>>>>>>> 33d5e2594df289d6fcf6aaeb13d56dd4142fa94d
	@Override
	public List<User> findAll() {
		return (List<User>)userDao.findAll();
	}
	
	@Override
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
}
