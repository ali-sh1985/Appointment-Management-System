package com.cs4.appointmentManagement.dao;

import java.util.List;

import com.cs4.appointmentManagement.domain.Doctor;
import com.cs4.appointmentManagement.domain.Patient;

public interface PatientDao extends GenericDao<Patient>{
	
	public int totalAppointmentPast(Long id);
	public int totalAppointmentFuture(Long id);
	public List<Doctor> getMyDoctors(Long id);

}
