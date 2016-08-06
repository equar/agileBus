package com.agilebus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.agilebus.delegate.EmailDelegate;
import com.agilebus.model.EmailBean;

@Controller
public class UtilityController {
	@Autowired
	private EmailDelegate emailDelegate;

	@RequestMapping(value = "/sendemail", method = RequestMethod.GET)
	public ModelAndView displayEmail(HttpServletRequest request, HttpServletResponse response, EmailBean emailBean) {
		ModelAndView model = new ModelAndView("emailform");
		model.addObject("emailBean", emailBean);
		return model;
	}

	@RequestMapping(value = "/sendemail", method = RequestMethod.POST)
	public ModelAndView sendEmail(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("emailBean") EmailBean emailBean) {
		ModelAndView model = null;
		emailBean.setFrom("equarhishe@gmail.com");
		try {
			boolean isEmailSent = emailDelegate.sendEmail(emailBean);
			if (isEmailSent) {
				model = new ModelAndView("emailsent");
			} else {
				model = new ModelAndView("emailfail");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return model;
	}
}