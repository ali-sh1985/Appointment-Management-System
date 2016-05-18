package com.cs4.appointmentManagement.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.AppointmentDao;
import com.cs4.appointmentManagement.domain.Appointment;

@Repository
public class AppointmentDaoImpl extends GenericDaoImpl<Appointment> implements AppointmentDao {
	public AppointmentDaoImpl() {
		super.setDaoType(Appointment.class);
	}

	@Override
	public List<Appointment> findByDoctorId(Long id) {
		return entityManager.createQuery("FROM Appointment a WHERE a.doctor.id = :doctorId")
		.setParameter("doctorId", id)
		.getResultList();
	}
}
