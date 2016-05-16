package com.cs4.appointmentManagement.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Patient {

	@Id
	@GeneratedValue
	private Long Id;

	@Column(name = "First_Name")
	private String firstName;

	@Column(name = "Last_Name")
	private String lastName;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "Patient_Doctor", joinColumns = @JoinColumn(name = "Patient_ID"), inverseJoinColumns = @JoinColumn(name = "Doctor_ID"))
	private List<Doctor> doctors;
	
	@OneToMany(mappedBy = "patient")
	private List<Appointment> appointmentsList;
}
