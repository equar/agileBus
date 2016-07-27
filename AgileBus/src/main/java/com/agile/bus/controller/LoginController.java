package com.agile.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.agile.bus.delegate.LoginDelegate;
import com.agile.bus.viewBean.LoginBean;


@Controller
public class LoginController
{
		@Autowired
		private LoginDelegate loginDelegate;

		@RequestMapping(value="/login",method=RequestMethod.GET)
		public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean)
		{
			ModelAndView model = new ModelAndView("login");
			//LoginBean loginBean = new LoginBean();
			model.addObject("loginBean", loginBean);
			return model;
		}
		@RequestMapping(value="/login",method=RequestMethod.POST)
		public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean")LoginBean loginBean)
		{
				ModelAndView model= null;
				try
				{
						boolean isValidUser = loginDelegate.isValidUser(loginBean.getUsername(), loginBean.getPassword());
						if(isValidUser)
						{
								System.out.println("User Login Successful");
								request.setAttribute("loggedInUser", loginBean.getUsername());
								model = new ModelAndView("welcome");
						}
						else
						{
								model = new ModelAndView("login");
								request.setAttribute("message", "Invalid credentials!!");
						}

				}
				catch(Exception e)
				{
						e.printStackTrace();
				}

				return model;
		}
}
