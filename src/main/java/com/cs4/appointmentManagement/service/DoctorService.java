package com.cs4.appointmentManagement.service;

import java.util.List;

import com.cs4.appointmentManagement.domain.Doctor;

public interface DoctorService {
	void save(Doctor doctor);

    void delete(Long id);

    Doctor findOne(Long id);

    Doctor update(Doctor doctor);   
    
    List<Doctor> findAll();
}
