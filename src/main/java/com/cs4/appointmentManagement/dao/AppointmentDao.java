package com.cs4.appointmentManagement.dao;

import java.util.List;

import com.cs4.appointmentManagement.domain.Appointment;

public interface AppointmentDao extends GenericDao<Appointment> {
	
	public List<Appointment> getAppointmentsByUserID(Long id);
	
}
