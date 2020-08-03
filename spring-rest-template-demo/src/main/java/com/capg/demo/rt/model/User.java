package com.capg.demo.rt.model;

public class User {

	private String login;
	private String name;
	private String location;
	private int public_repos;
	private String avatar_url;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPublic_repos() {
		return public_repos;
	}
	public void setPublic_repos(int public_repos) {
		this.public_repos = public_repos;
	}
	public String getAvatar_url() {
		return avatar_url;
	}
	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}
	public User(String login, String name, String location, int public_repos, String avatar_url) {
		super();
		this.login = login;
		this.name = name;
		this.location = location;
		this.public_repos = public_repos;
		this.avatar_url = avatar_url;
	}
	@Override
	public String toString() {
		return "User [login=" + login + ", name=" + name + ", location=" + location + ", public_repos=" + public_repos
				+ ", avatar_url=" + avatar_url + "]";
	}
	
	
	
	
}
