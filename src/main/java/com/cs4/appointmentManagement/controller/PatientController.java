package com.cs4.appointmentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs4.appointmentManagement.domain.User;
import com.cs4.appointmentManagement.service.AppointmentService;
import com.cs4.appointmentManagement.service.PatientService;
import com.cs4.appointmentManagement.service.UserService;

@Controller
@RequestMapping("/p")
public class PatientController {

	@Autowired
	AppointmentService appointmentService;
	
	@Autowired
	PatientService patientService;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = {"/", "/home"})
	public String listAppointments(Model model){
		model.addAttribute("appointments", appointmentService.getAppointmentsByUserID(getUserID(getPrincipal())));
		model.addAttribute("user", getPrincipal());
		System.out.println("Logged IN username: " + getPrincipal());
		System.out.println("Logged IN user ID: " + getUserID(getPrincipal()));
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
	
	@RequestMapping(value="/bookapt/{patientID}", method=RequestMethod.GET)
	public String bookAppointment(Model model, @PathVariable Long patientID){
		
		return "patient/bookAppointment";
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
		
		private Long getUserID(String username){
			return userService.findUserID(username);
		}


	    
	

}
