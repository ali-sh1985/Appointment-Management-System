package com.cs4.appointmentManagement.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CREDENTIALS")
public class UserCredentials {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CREDENTIAL_ID")
	private Long id;
	
	@Column(name = "USERNAME", nullable = false, unique = true, length = 127)
	private String userName;
	
	@Column(name = "PASSWORD", nullable = false, length = 32)
	private String password;
	
	@Column(nullable = false, length = 32)
	private String verifyPassword;
	
	@Column(name="ENABLED")
	private Boolean enabled;

	@OneToOne(mappedBy = "userCredentials", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private User user;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "credential_authority", joinColumns = {
			@JoinColumn(name = "credential_id") }, inverseJoinColumns = {
					@JoinColumn(name = "authority_id", unique = true) })
	private List<Authority> authority = new ArrayList<Authority>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Authority> getAuthority() {
		return authority;
	}

	public void setAuthority(List<Authority> authority) {
		this.authority = authority;
	}
}
