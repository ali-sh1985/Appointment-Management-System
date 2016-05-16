package com.cs4.appointmentManagement.dao.impl;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.DoctorDao;
import com.cs4.appointmentManagement.domain.Doctor;

@Repository
public class DoctorDaoImpl extends GenericDaoImpl<Doctor> implements DoctorDao{
	public DoctorDaoImpl() {
		super.setDaoType(Doctor.class);
	}
}
