package com.capg.demo.traineeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.traineeapp.model.Trainee;
import com.capg.demo.traineeapp.service.TraineeService;
@RestController
public class TraineeRestController {

	@Autowired
	TraineeService service;
	
	@GetMapping("/trainees")
//	@ResponseBody
	public List<Trainee> getAllTrainese() {
		return service.getAllTrainees();
	}
	
	@PostMapping("/trainee")
	public Trainee addTrainee(@RequestBody Trainee t1) {
		
		return service.addTrainee(t1);
		
	}
	
	@GetMapping("/trainee/id/{id}")
	public Trainee findTrainee(@PathVariable("id") int tId) {
		return service.getTrainee(tId);
	}
	
	@DeleteMapping("/trainee/id/{id}")
	public void deleteTrainee(@PathVariable int id) {
		service.removeTrainee(id);
	}
	
}
