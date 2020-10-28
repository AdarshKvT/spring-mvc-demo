package com.kvtsoft.springdemo.mvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentEnrollment {

	// map the enrollment-form View Template
	@RequestMapping("/showEnrollmentForm")
	public String showEnrollmentForm() {
		return "enrollment-form";
	}

	// student enrollment method
	@RequestMapping("/studentEnrollment")
	public String studentEnrollment(@RequestParam("studentName") String studentName,
			@RequestParam("enrollNo") String enrollNo, @RequestParam("branch") String branch, Model model) {

		// convert the values
		String studentN = studentName.toUpperCase();
		String enrollN = enrollNo.toUpperCase();
		String branchN = branch.toUpperCase();

		Map<String, String> map = new HashMap<String, String>();
		map.put("studentName", studentN);
		map.put("enrollNo", enrollN);
		map.put("branch", branchN);

		// add values to model which will be represented in the View template
		model.addAllAttributes(map);
		return "enrollment";
	}

}
