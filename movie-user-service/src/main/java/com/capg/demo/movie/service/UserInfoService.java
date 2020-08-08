package com.capg.demo.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.movie.model.UserInfo;
import com.capg.demo.movie.repo.UserInfoRepo;

@Service
public class UserInfoService {

	@Autowired
	UserInfoRepo repo;
	
	public UserInfo addUserInfo(UserInfo user) {
		return repo.save(user);
	}
	
	public UserInfo getUserByUserNameAndPassword(String userName,String password) {
		return repo.findByUserNameAndPassword(userName, password);
	}
	
	
}
