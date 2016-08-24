package com.agilebus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.agilebus.model.Bus;
import com.agilebus.model.HelpBean;
import com.agilebus.model.TicketAgent;
import com.agilebus.service.BusService;

@Controller
public class BusController {

	@Autowired
	private BusService busService;

	public void setBusService(BusService busService) {
		this.busService = busService;
	}

	@RequestMapping(value = { "/", "/searchbus" }, method = RequestMethod.GET)
	public ModelAndView displaySearchBus(HttpServletRequest request, HttpServletResponse response, Bus bus) {
		ModelAndView model = new ModelAndView("bussearch");
		model.addObject("bussearch", bus);
		return model;
	}

	@RequestMapping(value = "/searchbus", method = RequestMethod.POST)
	public ModelAndView searchBus(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("bus") Bus bus) {
		ModelAndView model = null;

		try {
			boolean isValidUser = busService.isValidUser(bus);
			if (isValidUser) {
				System.out.println("User Login Successful");
				model = new ModelAndView("bussearch");
			} else {
				model = new ModelAndView("bussearch");
				request.setAttribute("message", "Invalid credentials!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		model = new ModelAndView("searchbusresults");

		return model;
	}

	@RequestMapping(value = "/printticket", method = RequestMethod.GET)
	public ModelAndView displayPrintTicket(HttpServletRequest request, HttpServletResponse response,
			TicketAgent ticketAgent) {
		ModelAndView model = new ModelAndView("printticket");
		model.addObject("ticketAgent", ticketAgent);
		return model;
	}

	@RequestMapping(value = "/writeus", method = RequestMethod.GET)
	public ModelAndView displayWriteUs(HttpServletRequest request, HttpServletResponse response, HelpBean helpBean) {
		ModelAndView model = new ModelAndView("needhelp");
		model.addObject("helpBean", helpBean);
		return model;
	}

	@RequestMapping(value = "/ticketcancel", method = RequestMethod.GET)
	public ModelAndView displayCancelTicket(HttpServletRequest request, HttpServletResponse response,
			TicketAgent ticketAgent) {
		ModelAndView model = new ModelAndView("cancelticket");
		model.addObject("ticketAgent", ticketAgent);
		return model;
	}

}
