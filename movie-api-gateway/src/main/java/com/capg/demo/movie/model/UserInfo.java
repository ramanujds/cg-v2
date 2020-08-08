package com.capg.demo.movie.model;

public class UserInfo {


	private int userId;

	private String userName;
	private String password;
	private String userType;
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}

	public UserInfo(String userName, String password, String userType) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	
}
