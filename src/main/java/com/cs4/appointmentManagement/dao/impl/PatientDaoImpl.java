package com.cs4.appointmentManagement.dao.impl;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.PatientDao;
import com.cs4.appointmentManagement.domain.Patient;

@Repository
public class PatientDaoImpl extends GenericDaoImpl<Patient> implements PatientDao {
	public PatientDaoImpl() {
		super.setDaoType(Patient.class);
	}
}
