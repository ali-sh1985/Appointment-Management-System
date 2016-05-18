package com.cs4.appointmentManagement.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Specialty {
	@Id
	@GeneratedValue
	private Long Id;
	
	@Column(name="Specialty_Name")
	private String name;
	
	@OneToMany(mappedBy = "specialty")
	private List<Doctor> doctors;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	
	@Override
	public String toString() {
		return "Speciality [Id=" + Id + ", name=" + name + ", doctors=" + doctors + "]";
	}
}
