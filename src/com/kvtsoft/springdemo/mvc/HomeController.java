package com.kvtsoft.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// defining a controller method
	@RequestMapping("/") // map the url to this method
	public String showPage() {
		return "main-menu";
	}
}
