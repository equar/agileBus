package com.agilebus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.agilebus.delegate.LoginDelegate;
import com.agilebus.model.LoginBean;

@Controller
public class LoginController {
	@Autowired
	private LoginDelegate loginDelegate;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean) {
		ModelAndView model = new ModelAndView("login");
		// LoginBean loginBean = new LoginBean();
		model.addObject("loginBean", loginBean);
		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("loginBean") LoginBean loginBean) {
		ModelAndView model = null;
		try {
			boolean isValidUser = loginDelegate.isValidUser(loginBean);
			if (isValidUser) {
				System.out.println("User Login Successful");
				request.setAttribute("loggedInUser", loginBean.getUsername());
				model = new ModelAndView("welcome");
			} else {
				model = new ModelAndView("login");
				request.setAttribute("message", "Invalid credentials!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return model;
	}

	@RequestMapping(value = "/changepassword", method = RequestMethod.POST)
	public ModelAndView changePassword(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("loginBean") LoginBean loginBean) {
		ModelAndView model = null;
		try {
			boolean isValidUser = false;
			if (isValidUser) {
				System.out.println("User Login Successful");
				request.setAttribute("loggedInUser", loginBean.getUsername());
				model = new ModelAndView("welcome");
			} else {
				model = new ModelAndView("login");
				request.setAttribute("message", "Invalid credentials!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}

	@RequestMapping(value = "/resetpassword", method = RequestMethod.POST)
	public ModelAndView resetPassword(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("loginBean") LoginBean loginBean) {
		ModelAndView model = null;
		try {
			boolean isValidUser = false;
			if (isValidUser) {
				System.out.println("User Login Successful");
				request.setAttribute("loggedInUser", loginBean.getUsername());
				model = new ModelAndView("welcome");
			} else {
				model = new ModelAndView("login");
				request.setAttribute("message", "Invalid credentials!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}

	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public ModelAndView registerUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("loginBean") LoginBean loginBean) {
		ModelAndView model = null;
		try {
			boolean isValidUser = false;
			if (isValidUser) {
				System.out.println("User Login Successful");
				request.setAttribute("loggedInUser", loginBean.getUsername());
				model = new ModelAndView("welcome");
			} else {
				model = new ModelAndView("login");
				request.setAttribute("message", "Invalid credentials!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}

	@RequestMapping(value = "/forgotpassword", method = RequestMethod.POST)
	public ModelAndView forgotPassword(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("loginBean") LoginBean loginBean) {
		ModelAndView model = null;
		try {
			boolean isValidUser = false;
			if (isValidUser) {
				System.out.println("User Login Successful");
				request.setAttribute("loggedInUser", loginBean.getUsername());
				model = new ModelAndView("welcome");
			} else {
				model = new ModelAndView("login");
				request.setAttribute("message", "Invalid credentials!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
}
