package com.cs4.appointmentManagement.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Specialty {

	@Id
	@GeneratedValue
	private Long Id;
	
	@Column(name="Specialty_Name")
	private String name;
	
	@OneToMany(mappedBy = "specialty")
	private List<Doctor> doctors;
}
