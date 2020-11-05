package com.kvtsoft.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// pre-process method
	// add an initbinder ... to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for validation
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		System.out.println("@initBinder method excuting ... ");
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}

	// tell spring to validate the customer object that is being passed in
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {

		try {
			// printing values for debugging
			String theFirstName = theCustomer.getFirstName();
			System.out.println("theFisrtName length --> " + theFirstName.length() + " print: " + theFirstName);

			String theLastName = theCustomer.getLastName();
			System.out.println("theLastName length --> " + theLastName.length() + " print: " + theLastName);

			System.out.println("theBindingResult--> " + theBindingResult);
		} catch (Exception e) {
			System.out.println("exception: " + e.getMessage());
		}

		if (theBindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";

		}
	}
}
