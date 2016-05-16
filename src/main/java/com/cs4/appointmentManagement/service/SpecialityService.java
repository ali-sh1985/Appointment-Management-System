package com.cs4.appointmentManagement.service;

import java.util.List;

import com.cs4.appointmentManagement.domain.Speciality;

public interface SpecialityService {
	void save(Speciality speciality);

    void delete(Long id);

    Speciality findOne(Long id);

    Speciality update(Speciality speciality);   
    
    List<Speciality> findAll();
}
