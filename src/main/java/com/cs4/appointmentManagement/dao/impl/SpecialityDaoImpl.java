package com.cs4.appointmentManagement.dao.impl;

import org.springframework.stereotype.Repository;

import com.cs4.appointmentManagement.dao.SpecialityDao;
import com.cs4.appointmentManagement.domain.Settings;
import com.cs4.appointmentManagement.domain.Speciality;

@Repository
public class SpecialityDaoImpl extends GenericDaoImpl<Speciality> implements SpecialityDao{
	public SpecialityDaoImpl() {
		super.setDaoType(Speciality.class);
	}
}
