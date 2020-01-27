package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserManagment {

	@GetMapping(value = { "/", "/login" })
	public ModelAndView login() {

		ModelAndView modelAndView = new ModelAndView("managment/Login");

		return modelAndView;
	}

}
