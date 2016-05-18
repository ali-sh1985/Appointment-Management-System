package com.cs4.appointmentManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs4.appointmentManagement.dao.UserCredentialsDao;
import com.cs4.appointmentManagement.domain.Authority;
import com.cs4.appointmentManagement.domain.User;
import com.cs4.appointmentManagement.domain.UserCredentials;
import com.cs4.appointmentManagement.service.UserCredentialsService;

@Service
public class UserCredentialsServiceImpl implements UserCredentialsService {

	@Autowired
	private UserCredentialsDao usercredentialsDao;
	
	@Override
	public void save(UserCredentials userCredentials) {
	usercredentialsDao.save(userCredentials);
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserCredentials findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserCredentials update(UserCredentials userCredentials) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserCredentials> findAll() {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public UserCredentials findByUsername(String username) {
		return (UserCredentials) usercredentialsDao.findByUsername(username);
	}
	
	@Override
	public List<Authority> getAllAuthorities(){
		return (List<Authority>) usercredentialsDao.getAllAuthorities();
	}
	
}
