package com.cs4.appointmentManagement.dao.impl;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.SpecialtyDao;
import com.cs4.appointmentManagement.domain.Settings;
import com.cs4.appointmentManagement.domain.Specialty;

@Repository
public class SpecialtyDaoImpl extends GenericDaoImpl<Specialty> implements SpecialtyDao{
	public SpecialtyDaoImpl() {
		super.setDaoType(Specialty.class);
	}
}
