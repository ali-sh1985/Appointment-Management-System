package com.cs4.appointmentManagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Calendar {
	@Id
	@GeneratedValue
	private Long Id;
}
