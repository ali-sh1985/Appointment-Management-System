package com.cs4.appointmentManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs4.appointmentManagement.dao.CalendarDao;
import com.cs4.appointmentManagement.domain.Calendar;
import com.cs4.appointmentManagement.service.CalendarService;

@Service
@Transactional 
public class CalendarServiceImpl implements CalendarService{

	@Autowired
	private CalendarDao calenderDao;
	
	@Override
	public void save(Calendar calendar) {
		calenderDao.save(calendar);
		
	}

	@Override
	public void delete(Long id) {
		calenderDao.delete(id);
		
	}

	@Override
	public Calendar findOne(Long id) {
		return calenderDao.findOne(id);
	}

	@Override
	public Calendar update(Calendar calendar) {
		return calenderDao.update(calendar);
	}

	@Override
	public List<Calendar> findAll() {
		return (List<Calendar>)calenderDao.findAll();
	}

}
