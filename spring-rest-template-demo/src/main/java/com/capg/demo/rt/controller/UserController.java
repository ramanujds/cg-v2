package com.capg.demo.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.capg.demo.rt.model.User;

@Controller
public class UserController {

	@Autowired
	RestTemplate rt;
	
	@PostMapping("/getDetails")
	public String getUserInfo(@RequestParam("userId") String userId, Model m) {
		//User user=rt.getForObject("https://api.github.com/users/"+userId, User.class);
		try {
		ResponseEntity<User> userEntity=rt.getForEntity("https://api.github.com/users/"+userId, User.class);
		
		m.addAttribute("user", userEntity.getBody());
		return "show-user-details.jsp";
		}
		catch (Exception e) {
			
				return "error.jsp";
			
		}
	}
	
	
}
