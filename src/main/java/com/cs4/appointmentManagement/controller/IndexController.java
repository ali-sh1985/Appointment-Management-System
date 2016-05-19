package com.cs4.appointmentManagement.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@RequestMapping(value={"/", "/index"}, method=RequestMethod.GET)
	public String getIndexPage() {
		
		return "index";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getHomePage(HttpServletRequest request) {
		if(request.isUserInRole("ROLE_DOCTOR")) {
			return "redirect:doctor/";
		} else if(request.isUserInRole("ROLE_PATIENT")) {
			return "redirect:p/";
		} else {
			return "home";
		}		
	}
}
