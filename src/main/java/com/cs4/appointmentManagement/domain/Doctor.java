package com.cs4.appointmentManagement.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value = "doctor")
public class Doctor extends User {
	
//	@Id
//	@GeneratedValue
//	private Long Id;
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Specialty specialty;
	
	@ManyToMany(mappedBy = "doctors")
	private List<Patient> patients;
	
	@OneToMany(mappedBy = "doctor")
	private List<Appointment> appointmentsList;
	
	
	public Doctor() {}
	
	public Doctor(User user) {
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

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpeciality(Specialty specialty) {
		this.specialty = specialty;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public List<Appointment> getAppointmentsList() {
		return appointmentsList;
	}

	public void setAppointmentsList(List<Appointment> appointmentsList) {
		this.appointmentsList = appointmentsList;
	}

	public String getAsString() {
		return "Doctor [firstName=" + firstName + ", lastName=" + lastName + ", specialty=" + specialty
				+ ", patients=" + patients + ", appointmentsList=" + appointmentsList + "]";
	}	
	
	
}
