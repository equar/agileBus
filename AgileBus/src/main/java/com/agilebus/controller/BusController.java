package com.agilebus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.agilebus.delegate.BusDelegate;
import com.agilebus.model.BusBean;

@Controller
public class BusController {

	@Autowired
	private BusDelegate busDelegate;

	@RequestMapping(value = "/searchbus", method = RequestMethod.GET)
	public ModelAndView displaySearchBus(HttpServletRequest request, HttpServletResponse response, BusBean busBean) {
		ModelAndView model = new ModelAndView("bussearch");
		model.addObject("bussearch", busBean);
		return model;
	}

	@RequestMapping(value = "/searchbus", method = RequestMethod.POST)
	public ModelAndView searchBus(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("busBean") BusBean busBean) {
		ModelAndView model = null;

		try {
			boolean isValidUser = busDelegate.isValidUser(busBean);
			if (isValidUser) {
				System.out.println("User Login Successful");
				model = new ModelAndView("welcome");
			} else {
				model = new ModelAndView("bussearch");
				request.setAttribute("message", "Invalid credentials!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		model = new ModelAndView("searchbus");

		return model;
	}

}
