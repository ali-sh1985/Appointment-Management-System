package com.cs4.appointmentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs4.appointmentManagement.domain.User;
import com.cs4.appointmentManagement.service.AppointmentService;
import com.cs4.appointmentManagement.service.PatientService;

@Controller
@RequestMapping("/p")
public class PatientController {

	@Autowired
	AppointmentService appointmentService;
	
	@Autowired
	PatientService patientService;
	
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
	
	@RequestMapping(value="/profile/{patientID}")
	public String myProfile(Model model, @PathVariable Long patientID){
		model.addAttribute("profile", patientService.findOne(patientID));
		model.addAttribute("past", patientService.totalAppointmentPast(patientID));
		model.addAttribute("future", patientService.totalAppointmentFuture(patientID));
		model.addAttribute("doctors", patientService.getMyDoctors(patientID));
		return "patient/profile";
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
