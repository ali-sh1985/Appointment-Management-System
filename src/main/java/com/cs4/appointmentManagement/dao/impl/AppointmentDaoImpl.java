package com.cs4.appointmentManagement.dao.impl;

import java.util.List;

import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.AppointmentDao;
import com.cs4.appointmentManagement.domain.Appointment;

@Repository
public class AppointmentDaoImpl extends GenericDaoImpl<Appointment> implements AppointmentDao {
	public AppointmentDaoImpl() {
		super.setDaoType(Appointment.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Appointment> getAppointmentsByUserID(Long id) {

		Query query = entityManager.createQuery("SELECT a FROM " + daoType.getName()
				+ " a INNER JOIN a.patient p WHERE " + "p.id = :id ORDER BY a.dateTime DESC");
		query.setParameter("id", id);
		return (List<Appointment>) query.getResultList();
	}

	@Override
	public List<Appointment> findByDoctorId(Long id) {
		return entityManager.createQuery("FROM Appointment a WHERE a.doctor.id = :doctorId")
				.setParameter("doctorId", id).getResultList();
	}
}