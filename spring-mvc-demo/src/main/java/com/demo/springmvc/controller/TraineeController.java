package com.demo.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.springmvc.model.Trainee;
import com.demo.springmvc.service.TraineeService;

@Controller
public class TraineeController {

	@Autowired
	TraineeService service;
	
//	@PostMapping("/add")
//	public String addTrainee(HttpServletRequest req) {
//		int id=Integer.parseInt(req.getParameter("txtId"));
//		String email=req.getParameter("email");
//		String tName=req.getParameter("txtName");
//		
//		
//		Trainee t1=new Trainee(id,tName,email);
//		
//		req.setAttribute("trainee", t1);
//		return "success";
//		
//	}
	
//	@PostMapping("/add")
//	public String addTrainee(@RequestParam("txtId") int id,
//								@RequestParam("txtName") String tName,
//								@RequestParam("email") String email, Model m) {
//		
//		Trainee t1=new Trainee(id,tName,email);
//		
//		m.addAttribute("trainee", t1);
//		return "success";
//		
//	}
	
	@PostMapping("/add")
	public String addTrainee(@ModelAttribute Trainee t1, Model m) {
		service.addTrainee(t1);
		m.addAttribute("trainee", t1);
		return "success";	
	}
	
	@GetMapping("/find")
	public String fetchTrainee(@RequestParam("tId") int tId, Model m){
		Trainee t1=service.getTrainee(tId);
		m.addAttribute("trainee", t1);
		return "show";
	}

}
