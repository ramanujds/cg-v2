package com.capg.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.movie.model.UserCredentials;
import com.capg.demo.movie.model.UserInfo;
import com.capg.demo.movie.service.UserInfoService;

@RestController
@RequestMapping("/users")
public class UserInfoController {

	@Autowired
	private UserInfoService service;
	
	@PostMapping("/admin/add")
	public UserInfo addUserInfo(@RequestBody UserInfo user) {
		UserInfo actual = service.addUserInfo(user);
		UserInfo userInfo= new UserInfo(actual.getUserName(),"*********",actual.getUserType());
		userInfo.setUserId(actual.getUserId());
		return userInfo;
	}
	
	@PostMapping("/public/authenticate")
	public UserInfo getUserInfo(@RequestBody UserCredentials credentials) {
		return service.getUserByUserNameAndPassword(credentials.getUserName(), credentials.getPassword());
	}
	
	
}
