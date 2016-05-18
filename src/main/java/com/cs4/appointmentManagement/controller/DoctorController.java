package com.cs4.appointmentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs4.appointmentManagement.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping(value={"/","/list"})
	private String listDoctors(Model model) {
		model.addAttribute("listDoctors", this.doctorService.findAll());
		return "doctor/list";
	}
	
	@RequestMapping(value={"/profile/{doctorId}"})
	private String showProfile(Model model, @PathVariable Long doctorId) {
		model.addAttribute("doctor", this.doctorService.findOne(doctorId));
		return "doctor/profile";
	}
}
