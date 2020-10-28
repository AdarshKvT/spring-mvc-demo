package com.kvtsoft.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetFortuneController {

	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "fortune-form";
	}

	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "cookie";
	}

	// new controller method to read form data and add data to the model

	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {

		// read the request parameter from HTML form
		String theName = request.getParameter("studentName");

		// convert the message
		String result = "Yo! " + theName.toUpperCase();

		// add message to the model
		model.addAttribute("message", result);

		// return the name of the page
		return "cookie";
	}

}
