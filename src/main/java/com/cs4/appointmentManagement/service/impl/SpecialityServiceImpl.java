package com.cs4.appointmentManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs4.appointmentManagement.dao.SpecialityDao;
import com.cs4.appointmentManagement.domain.Speciality;
import com.cs4.appointmentManagement.service.SpecialityService;

@Service
@Transactional
public class SpecialityServiceImpl implements SpecialityService {

	@Autowired
	private SpecialityDao specialityDao;
	
	@Override
	public void save(Speciality speciality) {
		specialityDao.save(speciality);
	}

	@Override
	public void delete(Long id) {
		specialityDao.delete(id);
	}

	@Override
	public Speciality findOne(Long id) {
		return specialityDao.findOne(id);
	}

	@Override
	public Speciality update(Speciality speciality) {
		return specialityDao.update(speciality);
	}

	@Override
	public List<Speciality> findAll() {
		return (List<Speciality>)specialityDao.findAll();
	}
}
