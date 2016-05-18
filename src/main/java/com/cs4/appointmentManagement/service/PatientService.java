package com.cs4.appointmentManagement.service;

import java.util.List;

import com.cs4.appointmentManagement.domain.Doctor;
import com.cs4.appointmentManagement.domain.Patient;

public interface PatientService {
	void save(Patient patient);

    void delete(Long id);

    Patient findOne(Long id);

    Patient update(Patient patient);   
    
    List<Patient> findAll();
    
    int totalAppointmentPast(Long id);
    
    int totalAppointmentFuture(Long id);
    
    public List<Doctor> getMyDoctors(Long id);
    
}
