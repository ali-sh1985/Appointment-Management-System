package com.cs4.appointmentManagement.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value = "patient")
public class Patient extends User {

//	@Id
//	@GeneratedValue
//	private Long Id;

	@Column(name = "First_Name")
	private String firstName;

	@Column(name = "Last_Name")
	private String lastName;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "Patient_Doctor", joinColumns = @JoinColumn(name = "Patient_ID"), inverseJoinColumns = @JoinColumn(name = "Doctor_ID"))
	private List<Doctor> doctors;
	
	@OneToMany(mappedBy = "patient")
	private List<Appointment> appointmentsList;
	
	public Patient() {}
	
	public Patient(User user) {
		super.setFname(user.getFname());
		super.setLname(user.getLname());
		super.setStreet(user.getStreet());
		super.setCity(user.getCity());
		super.setState(user.getState());
		super.setEmail(user.getEmail());
		super.setUserCredentials(user.getUserCredentials());
		super.setUserType(user.getUserType());
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public List<Appointment> getAppointmentsList() {
		return appointmentsList;
	}

	public void setAppointmentsList(List<Appointment> appointmentsList) {
		this.appointmentsList = appointmentsList;
	}
}
