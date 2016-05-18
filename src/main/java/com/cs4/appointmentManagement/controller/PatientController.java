package com.cs4.appointmentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs4.appointmentManagement.domain.User;
import com.cs4.appointmentManagement.service.AppointmentService;

@Controller
@RequestMapping("/p")
public class PatientController {

	@Autowired
	AppointmentService appointmentService;
	
	@RequestMapping(value = {"/", "/home"})
	public String listAppointments(Model model){
		model.addAttribute("appointments", appointmentService.getAppointmentsByUserID(new Long(1)));
		model.addAttribute("user", getPrincipal());
		System.out.println("Logged IN user : " + getPrincipal());
		System.out.println(appointmentService.getAppointmentsByUserID(new Long(1)).toString());
		return "patient/appointments";
	}
	
	@RequestMapping(value = "/a/{appointmentId}")
	public String appointmentDetail(Model model, @PathVariable Long appointmentId){
		model.addAttribute("appointment", appointmentService.findOne(appointmentId));
		return "patient/appointmentDetail";
	}
	
	
	//Getting User-Name
		private String getPrincipal(){
			String userName = null;
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

			if (principal instanceof User) {
				userName = ((User)principal).getFname();
			} else {
				userName = principal.toString();
			}
			return userName;
		}


	    
	

}
