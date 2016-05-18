package com.cs4.appointmentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public String getHomePage() {
		return "home";
	}
}
