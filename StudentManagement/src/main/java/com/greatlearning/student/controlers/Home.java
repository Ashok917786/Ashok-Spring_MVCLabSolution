package com.greatlearning.student.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Home {
	
	@RequestMapping("/")
	public String ShowMainPage() {
		return "home";
	}

}
