package com.cs4.appointmentManagement.dao;

import java.util.List;

import com.cs4.appointmentManagement.domain.Appointment;

public interface AppointmentDao extends GenericDao<Appointment> {
	List<Appointment> findByDoctorId(Long id);
}
