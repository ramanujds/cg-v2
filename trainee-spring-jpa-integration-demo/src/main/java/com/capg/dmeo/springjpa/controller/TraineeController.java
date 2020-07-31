package com.capg.dmeo.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.capg.dmeo.springjpa.errors.TraineeAlreadyExistsException;
import com.capg.dmeo.springjpa.errors.TraineeNotFoundException;
import com.capg.dmeo.springjpa.model.Trainee;
import com.capg.dmeo.springjpa.service.TraineeService;

@RestController
public class TraineeController {

	@Autowired
	TraineeService service;
	
	@PostMapping("/trainees")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Trainee addTrainee(@RequestBody Trainee trainee) throws TraineeAlreadyExistsException{
		
			return service.addTrainee(trainee);
		
	}
	
	@GetMapping("/trainees/id/{id}")
	public Trainee getTrainee(@PathVariable int id) {
		try{
			return service.getTrainee(id);
		}
		catch (TraineeNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
		}
	}
	
	@GetMapping("/trainees")
	public List<Trainee> getAllTrainees(){
		return service.getAllTrainees();
	}
	
	@DeleteMapping("/trainees/id/{id}")
	public void deleteTrainee(@PathVariable int id) throws TraineeNotFoundException {
		service.deleteTrainee(id);
	}
	
	@PutMapping("/trainees")
	public Trainee updateTrainee(@RequestBody Trainee trainee) throws TraineeNotFoundException {
		return service.updateTrainee(trainee);
	}
	
	@GetMapping("/trainees/name/{traineeName}")
	public Trainee getTraineeByName(@PathVariable String traineeName) throws TraineeNotFoundException {
		return service.findTraineeByName(traineeName);
	}
	
	@GetMapping("/trainees/name/{traineeName}/domain/{traineeDomain}")
	public Trainee getTraineeByName(@PathVariable String traineeName, @PathVariable String traineeDomain) throws TraineeNotFoundException {
		return service.findTraineeByNameAndDomain(traineeName, traineeDomain);
	}
}
