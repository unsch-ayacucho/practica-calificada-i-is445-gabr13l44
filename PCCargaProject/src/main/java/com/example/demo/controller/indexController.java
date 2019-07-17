package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.CargaService;


@Controller
@RequestMapping("/view")
public class indexController {
	@Autowired
	private CargaService cargaService;
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("listarCarga", cargaService.listarCarga());
		return "views/index";
	}
	
}
