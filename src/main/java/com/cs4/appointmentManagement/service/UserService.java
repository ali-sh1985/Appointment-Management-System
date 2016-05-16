package com.cs4.appointmentManagement.service;

import java.util.List;

import com.cs4.appointmentManagement.domain.User;

public interface UserService {
	void save(User user);

    void delete(Long id);

    User findOne(Long id);

    User update(User user);   
    
    List<User> findAll();
}
