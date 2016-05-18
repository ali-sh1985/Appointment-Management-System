package com.cs4.appointmentManagement.service;

import java.util.List;

import com.cs4.appointmentManagement.domain.Specialty;

public interface SpecialityService {
	void save(Specialty specialty);

    void delete(Long id);

    Specialty findOne(Long id);

    Specialty update(Specialty specialty);   
    
    List<Specialty> findAll();
}
