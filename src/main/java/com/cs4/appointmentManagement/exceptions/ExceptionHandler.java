package com.cs4.appointmentManagement.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandler {
	@org.springframework.web.bind.annotation.ExceptionHandler(value={Exception.class})
	public ModelAndView handleException(Exception ex) {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("error");
		mv.addObject("exception", ex);
		
		return mv;
	}
}
