package com.cs4.appointmentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs4.appointmentManagement.service.AppointmentService;

@Controller
@RequestMapping("/doctor")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
}
