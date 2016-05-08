package com.cs4.appointmentManagement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Specialty {

	@Id
	@GeneratedValue
	private Long Id;
	
	@Column(name="Specialty_Name")
	private String name;
}
