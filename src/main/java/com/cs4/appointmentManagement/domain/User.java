package com.cs4.appointmentManagement.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name="USER_TYPE")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "user_id")
	private Long id;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CREDENTIAL_ID")
	private UserCredentials userCredentials;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredential(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}
}
