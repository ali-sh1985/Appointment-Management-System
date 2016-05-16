package com.cs4.appointmentManagement.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

//@Entity
public class Doctor {
	
	@Id
	@GeneratedValue
	private Long Id;
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Specialty specialty;
	
	@ManyToMany(mappedBy = "doctors")
	private List<Patient> patients;
	
}
