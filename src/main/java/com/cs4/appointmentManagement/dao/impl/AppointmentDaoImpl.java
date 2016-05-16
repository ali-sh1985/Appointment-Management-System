package com.cs4.appointmentManagement.dao.impl;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.AppointmentDao;
import com.cs4.appointmentManagement.domain.Appointment;

@Repository
public class AppointmentDaoImpl extends GenericDaoImpl<Appointment> implements AppointmentDao {
	public AppointmentDaoImpl() {
		super.setDaoType(Appointment.class);
	}
}
