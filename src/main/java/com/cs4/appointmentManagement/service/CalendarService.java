package com.cs4.appointmentManagement.service;

import java.util.List;

import com.cs4.appointmentManagement.domain.Calendar;

public interface CalendarService {
	void save(Calendar calendar);

    void delete(Long id);

    Calendar findOne(Long id);

    Calendar update(Calendar calendar);   
    
    List<Calendar> findAll();
}
