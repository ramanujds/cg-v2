package com.example.demo.boot.traineeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TraineeController {

	@PostMapping("/add")
	public String getTraineeName(@RequestParam("txtName") String tName, Model m) {
		m.addAttribute("tname", tName);
		return "show";
	}
	
	@GetMapping
	public String showAddTraineePage() {
		return "add-trainee";
	}
	
}
