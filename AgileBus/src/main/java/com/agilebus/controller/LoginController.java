package com.agilebus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.agilebus.model.User;
import com.agilebus.model.UserRole;
import com.agilebus.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response, User user) {
		ModelAndView model = new ModelAndView("login");
		model.addObject("user", user);
		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") User user) {
		ModelAndView model = null;
		try {
			boolean isValidUser = loginService.isValidUser(user);
			if (isValidUser) {
				System.out.println("User Login Successful");
				request.setAttribute("loggedInUser", user.getEmailId());
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

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView displaySignUp(HttpServletRequest request, HttpServletResponse response, User user) {
		ModelAndView model = new ModelAndView("signup");
		model.addObject("user", user);
		return model;
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView executeSignUp(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") User user) {
		ModelAndView model = null;
		try {
			boolean isRegistered = loginService.registerAccount(user);
			if (isRegistered) {
				request.setAttribute("emailId", user.getEmailId());
				model = new ModelAndView("signupsuccess");
			} else {
				model = new ModelAndView("signup");
				request.setAttribute("message", "Invalid credentials!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return model;
	}

	@RequestMapping(value = "/changepassword", method = RequestMethod.GET)
	public ModelAndView displayChangePassword(HttpServletRequest request, HttpServletResponse response, User user) {
		ModelAndView model = new ModelAndView("passwordchange");
		model.addObject("user", user);
		return model;
	}

	@RequestMapping(value = "/changepassword", method = RequestMethod.POST)
	public ModelAndView changePassword(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") User user) {
		ModelAndView model = null;
		try {
			boolean isValidUser = false;
			if (isValidUser) {
				System.out.println("User Login Successful");
				request.setAttribute("loggedInUser", user.getEmailId());
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

	@RequestMapping(value = "/registeruser", method = RequestMethod.GET)
	public ModelAndView displaySignup(HttpServletRequest request, HttpServletResponse response, User user) {
		ModelAndView model = new ModelAndView("signup");
		// LoginBean user = new LoginBean();
		model.addObject("user", user);
		return model;
	}

	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public ModelAndView registerUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") User user) {
		ModelAndView model = null;
		try {
			boolean isValidUser = false;
			if (isValidUser) {
				System.out.println("User Login Successful");
				request.setAttribute("loggedInUser", user.getEmailId());
				model = new ModelAndView("welcome");
			} else {
				model = new ModelAndView("signup");
				request.setAttribute("message", "Invalid credentials!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}

	@RequestMapping(value = "/forgotpassword", method = RequestMethod.GET)
	public ModelAndView displayForgotPassword(HttpServletRequest request, HttpServletResponse response, User user) {
		ModelAndView model = new ModelAndView("forgotpassword");
		model.addObject("user", user);
		return model;
	}

	@RequestMapping(value = "/forgotpassword", method = RequestMethod.POST)
	public ModelAndView forgotPassword(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") User user) {
		ModelAndView model = null;
		try {
			boolean isValidUser = false;
			if (isValidUser) {
				System.out.println("User Login Successful");
				request.setAttribute("loggedInUser", user.getEmailId());
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

	@RequestMapping(value = "/addrole", method = RequestMethod.GET)
	public ModelAndView displayAddRole(HttpServletRequest request, HttpServletResponse response, UserRole roleBean) {
		ModelAndView model = new ModelAndView("addrole");
		model.addObject("roleBean", roleBean);
		return model;
	}

	@RequestMapping(value = "/addrole", method = RequestMethod.POST)
	public ModelAndView addRole(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("userRole") UserRole userRole) {
		ModelAndView model = null;
		try {
			boolean isRoleAdded = loginService.addUserRole(userRole);
			if (isRoleAdded) {
				request.setAttribute("message", "User Role added succesfully");
				model = new ModelAndView("addrole");
			} else {
				model = new ModelAndView("addrole");
				request.setAttribute("message", "User Role was not added");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}

}
