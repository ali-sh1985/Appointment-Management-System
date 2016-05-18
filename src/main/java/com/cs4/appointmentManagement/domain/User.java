package com.cs4.appointmentManagement.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name="USER_TYPE")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "user_id")
	private Long id;
	
	@NotEmpty
	@Size(min =3, max = 25, message = "Username error")
	@Column(name = "fname")
	private String fname;
	
	@NotEmpty
	@Size(min =3, max = 25, message = "last name error")
	@Column(name = "lname")
	private String lname;
	
	

	@Email
	@Column(name = "email")
	private String email;
	
	@Size(min =3, max = 25, message = "contact error")
	@Column(name = "contact")
	private String contact;
	
	@Size(min =3, max = 25, message = "street error")
	@Column(name = "street")
	private String street;
	
	@Size(min =3, max = 25, message = "state error")
	@Column(name = "state")
	private String state;
	
	@Size(min =3, max = 25, message = "city error")
	@Column(name = "city")
	private String city;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CREDENTIAL_ID")
	private UserCredentials userCredentials;
	
	@Column(name = "user_type")
	private String userType;
	
	

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	public String getAsString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", contact=" + contact
				+ ", street=" + street + ", state=" + state + ", city=" + city + ", userCredentials=" + userCredentials
				+ ", userType=" + userType + "]";
	}	
}
