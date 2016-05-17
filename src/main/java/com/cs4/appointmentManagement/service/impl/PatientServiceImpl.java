package com.cs4.appointmentManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs4.appointmentManagement.dao.PatientDao;
import com.cs4.appointmentManagement.domain.Patient;
import com.cs4.appointmentManagement.service.PatientService;

@Service
@Transactional
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientDao patientDao;
	@Override
	public void save(Patient patient) {
		patientDao.save(patient);
	}

	@Override
	public void delete(Long id) {
		patientDao.delete(id);
	}

	@Override
	public Patient findOne(Long id) {
		return patientDao.findOne(id);
	}

	@Override
	public Patient update(Patient patient) {
		return patientDao.update(patient);
	}

	@Override
	public List<Patient> findAll() {
		return (List<Patient>)patientDao.findAll();
	}
}
