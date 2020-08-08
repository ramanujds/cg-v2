package com.capg.demo.movie.util;

import org.springframework.stereotype.Component;

import com.capg.demo.movie.model.UserCredentials;
@Component
public class TokenUtil {

	public String generateToken(UserCredentials cred) {
		
		StringBuilder userNameSB=new StringBuilder(cred.getUserName());
		StringBuilder passwordSB=new StringBuilder(cred.getPassword());
		String encoded=userNameSB.reverse()+","+passwordSB.reverse();
		return encoded;
		
}

public UserCredentials decode(String token) {
	String []cred=token.split(",");
	StringBuilder userNameSB=new StringBuilder(cred[0]);
	StringBuilder passwordSB=new StringBuilder(cred[1]);
	return new UserCredentials(userNameSB.reverse().toString(),passwordSB.reverse().toString());
	
	
}
	
}
