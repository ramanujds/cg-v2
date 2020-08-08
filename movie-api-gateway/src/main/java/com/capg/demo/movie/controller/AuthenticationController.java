package com.capg.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.capg.demo.movie.model.AuthenticationResponse;
import com.capg.demo.movie.model.UserCredentials;
import com.capg.demo.movie.model.UserInfo;
import com.capg.demo.movie.service.AuthenticationService;
@RestController
@CrossOrigin
@RequestMapping("/api")
public class AuthenticationController {
	@Autowired
	AuthenticationService service;

	@PostMapping("/public/authenticate")
	public AuthenticationResponse authenticate(@RequestBody UserCredentials cred) {
		try {
			UserInfo userInfo=service.authenticate(cred);
			return service.authenticate(userInfo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Imvalid Username/Password");		}
	}
}
