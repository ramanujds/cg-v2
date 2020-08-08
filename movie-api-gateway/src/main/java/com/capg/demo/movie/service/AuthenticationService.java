package com.capg.demo.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Credential;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.demo.movie.model.AuthenticationResponse;
import com.capg.demo.movie.model.UserCredentials;
import com.capg.demo.movie.model.UserInfo;
import com.capg.demo.movie.util.TokenUtil;

@Service
public class AuthenticationService {

	@Autowired
	RestTemplate rt;
	@Autowired
	TokenUtil util;
	
	public UserInfo authenticate(UserCredentials credentials) {
		UserInfo userInfo=rt.postForObject("http://movie-user-service/users/public/authenticate", credentials, UserInfo.class);
		return userInfo;
	}
	
	public AuthenticationResponse authenticate(UserInfo userInfo) {
		String generatedToken=util.generateToken(new UserCredentials(userInfo.getUserName(),userInfo.getPassword()));
		AuthenticationResponse auth=new AuthenticationResponse();
		auth.setToken(generatedToken);
		return auth;
	}
	
	
	
}
