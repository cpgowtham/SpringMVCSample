package com.concretepage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.concretepage.model.Employee;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}

	// @RequestMapping(value="/usercheck", method = RequestMethod.POST)
	// public @ResponseBody int userCheck(@RequestBody Employee
	// emp,UriComponentsBuilder bui,HttpServletRequest
	// request,HttpServletResponse response,HttpSession session) throws
	// UnsupportedEncodingException {
	// String name=emp.getName();
	// String pwd=emp.getPwd();
	// System.out.println(name +"  "+pwd);
	// ModelAndView mav =new ModelAndView("success");
	// ModelMap model=mav.getModelMap();
	// HttpHeaders headers = new HttpHeaders();
	//
	// if("admin".equalsIgnoreCase(name)&&"admin".equalsIgnoreCase(pwd)){
	//
	// return 1;
	// }else{
	// return 0;
	// }
	//
	//
	// }

	@RequestMapping(value = "/userCheck", method = RequestMethod.POST)
	public ModelAndView userCheck(@ModelAttribute("loginDetails") Employee emp,
			HttpServletRequest request, HttpServletResponse response,
			HttpSession session) throws Exception {
		String name = emp.getName();
		String pwd = emp.getPwd();
		System.out.println(name + "  " + pwd);
		ModelAndView mav = new ModelAndView("success");
		if ("admin".equalsIgnoreCase(name) && "admin".equalsIgnoreCase(pwd)) {

			mav.getModelMap().addAttribute("message", name
					+ " you are successfully loggrd in");
		} else {

			mav.getModelMap().addAttribute("message",
					"Login failed either user name or password incorrect");
		}
        
		return mav;
	}

}