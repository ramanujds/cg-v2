package com.capg.demo.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.movie.model.UserInfo;

public interface UserInfoRepo extends JpaRepository<UserInfo, Integer> {

	public UserInfo findByUserName(String userName);
	
	public UserInfo findByUserNameAndPassword(String userName,String password);
	
}
