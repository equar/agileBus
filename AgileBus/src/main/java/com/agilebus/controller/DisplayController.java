package com.agilebus.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.agilebus.util.agileUtil;

@Controller
public class DisplayController {
	private static final Logger logger = Logger.getLogger(agileUtil.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView defaultPage() {
		logger.debug("HomePage-Attempted");
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security + Hibernate Example");
		model.addObject("message", "This is default page!");
		model.setViewName("main");
		logger.debug("HomePage-Displayed");
		return model;

	}

	

}