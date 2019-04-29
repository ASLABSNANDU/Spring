package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.exceptions.SpringException;
import com.spring.mvc.beens.Employee;

@Controller
public class UserRegisterandSinginController {
	HttpSession session = null;

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String printHello(HttpServletRequest req, ModelMap model) {
		if (checkUserLoginOrNot(req)) {
			return "afterLoginHome";
		}
		if (req.getAttribute("message") != null)
			model.addAttribute("message", req.getAttribute("message").toString());
		return "hello";
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public ModelAndView openSignUpPage(ModelMap model) {
		return new ModelAndView("employeeSignUp", "command", new Employee());
	}

	@RequestMapping(value = "/signIn", method = RequestMethod.GET)
	public ModelAndView openSignInPage(HttpServletRequest req, ModelMap model) {
		return new ModelAndView("employeeSignIn", "command", new Employee());
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public ModelAndView addEmployeeDetails(@ModelAttribute("SpringWeb") Employee employee, ModelMap model) {
		model.addAttribute("message", "Employee " + employee.getUserid() + "(" + employee.getName() + ") Saved !");
		return new ModelAndView("employeeSignUp", "command", new Employee());
	}

	@RequestMapping(value = "/checkEmployee", method = RequestMethod.POST)
	public String checkEmployeeDetails(HttpServletRequest req, @ModelAttribute("SpringWeb") Employee employee, ModelMap model) {
		session = req.getSession(false);
		if (!employee.getUserid().equals("123")) {
			throw new SpringException("Given Userid is wrong !");
		} else {
			model.addAttribute("userid", employee.getUserid());
		}
		if (!employee.getPswd().equals("123")) {
			throw new SpringException("Given password is wrong !");
		}
		model.addAttribute("message", "Employee Login Success with " + employee.getUserid() + "!");
		session.setAttribute("springmvc_userid", employee.getUserid());
		return "afterLoginHome";
	}

	@RequestMapping(value = "/afterLoginHome", method = RequestMethod.GET)
	public ModelAndView afterSignInPage(HttpServletRequest req, ModelMap model) {
		session = req.getSession(false);
		if (session.getAttribute("springmvc_userid") != null) {
			model.addAttribute("message", "Employee Login Success with " + session.getAttribute("springmvc_userid").toString() + "!");
			return new ModelAndView("afterLoginHome", model);
		} else {
			model.addAttribute("message", "Employee Logout Success !");
			return new ModelAndView("hello", model);
		}

	}

	@RequestMapping(value = "/signOut", method = RequestMethod.GET)
	public ModelAndView afterSignOutPage(HttpServletRequest req, ModelMap model) {
		session = req.getSession(false);
		model.addAttribute("message", "Employee Logout Success with " + session.getAttribute("springmvc_userid").toString() + "!");
		session.removeAttribute("springmvc_userid");
		return new ModelAndView("hello", model);
	}

	private boolean checkUserLoginOrNot(HttpServletRequest req) {
		session = req.getSession(false);
		if (session.getAttribute("springmvc_userid") != null) {
			return true;
		}
		return false;
	}

}
