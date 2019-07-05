package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/views")
public class indexController {
	
	@GetMapping("/index")
	public String index() {
		return "views/index";
	}
}
