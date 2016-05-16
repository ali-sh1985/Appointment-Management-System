package com.cs4.appointmentManagement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserCredentials {
	@Id
	@Column(nullable = false, unique = true)
	String username;
	
	@Column(nullable = false)
	String password;
	
	String verifyPassword;
	
	Boolean enabled;
}
