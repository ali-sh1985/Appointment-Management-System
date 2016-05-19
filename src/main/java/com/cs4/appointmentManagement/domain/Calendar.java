package com.cs4.appointmentManagement.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Calendar implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -488451281631366246L;
	@Id
	@GeneratedValue
	private Long Id;
}
