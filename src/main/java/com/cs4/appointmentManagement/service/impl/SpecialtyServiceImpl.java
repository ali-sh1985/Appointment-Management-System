package com.cs4.appointmentManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs4.appointmentManagement.dao.SpecialtyDao;
import com.cs4.appointmentManagement.domain.Specialty;
import com.cs4.appointmentManagement.service.SpecialityService;

@Service
@Transactional
public class SpecialtyServiceImpl implements SpecialityService {

	@Autowired
	private SpecialtyDao specialityDao;
	
	@Override
	public void save(Specialty specialty) {
		specialityDao.save(specialty);
	}
	

	@Override
	public void delete(Long id) {
		specialityDao.delete(id);
	}

	@Override
	public Specialty findOne(Long id) {
		return specialityDao.findOne(id);
	}

	@Override
	public Specialty update(Specialty specialty) {
		return specialityDao.update(specialty);
	}

	@Override
	public List<Specialty> findAll() {
		return (List<Specialty>)specialityDao.findAll();
	}
}
