package com.cs4.appointmentManagement.service;

import java.util.List;

import com.cs4.appointmentManagement.domain.Appointment;

public interface AppointmentService {
	void save(Appointment appointment);

    void delete(Long id);

    Appointment findOne(Long id);

    Appointment update(Appointment appointment);   
    
    List<Appointment> findAll();
    public List<Appointment> getAppointmentsByUserID(Long id);
}
