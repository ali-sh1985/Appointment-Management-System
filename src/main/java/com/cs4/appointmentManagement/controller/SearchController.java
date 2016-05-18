package com.cs4.appointmentManagement.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs4.appointmentManagement.service.UserService;

@Controller
public class SearchController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String asITis(Model model){
		return "search/search";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String search(Model model, @RequestParam(value = "query", required = false) String text){
		if(text != null){
			model.addAttribute("results", userService.search(text));
			return "search/search";
		}else{
			return "search/search";
		}
	}

}
