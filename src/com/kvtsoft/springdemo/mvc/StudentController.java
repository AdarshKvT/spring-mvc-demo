package com.kvtsoft.springdemo.mvc;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		// create a new student object
		Student theStudent = new Student();

		// add object to the model
		theModel.addAttribute("student", theStudent);

		// return student-form,jsp
		return "student-form";

	}

	// code for processing the form data
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		// generate enrollment number
		Random rn = new Random();

		Integer bound = 30000;
		Integer enrollmentNo = rn.nextInt(bound);

		theStudent.setEnrollmentNo(enrollmentNo);

		// to make sure spring is populating the data, just syso student
		System.out.println("theStudent Name: " + theStudent.getFirstName() + " " + theStudent.getLastName());

		// returne the confirmation page
		return "student-confirmation";
	}
}
