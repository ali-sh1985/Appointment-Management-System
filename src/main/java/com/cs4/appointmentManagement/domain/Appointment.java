package com.cs4.appointmentManagement.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Appointment {
	@Id
	@GeneratedValue
	private Long Id;
	
	private Date dateTime;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Doctor doctor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Patient patient;
	
}
