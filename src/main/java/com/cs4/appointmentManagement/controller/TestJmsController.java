package com.cs4.appointmentManagement.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs4.appointmentManagement.domain.Appointment;
import com.cs4.appointmentManagement.jms.MessageSender;

@Controller
public class TestJmsController {
	@Autowired
	@Qualifier("appointmentJmsSender")
	private MessageSender appointmentSender;
	
	@RequestMapping(value="/jms", method=RequestMethod.GET)
	public String sendMessage() {
		Appointment obj = new Appointment();
		obj.setDateTime(new Date());
		obj.setId(1L);
		obj.setDescription("heart problem");
		
		appointmentSender.sendMessage(obj);
		
		return "home";
	}
}
