package com.project.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalContorller {
	
	@GetMapping ("/cal/do")
	public String Cal() {
		return "calculator";
	}
}
