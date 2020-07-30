package com.demo.springmvc.model;

public class Trainee {
	
	private int id;
	private String tName;
	private String email;
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}

	public Trainee(int id, String tName, String email) {
		super();
		this.id = id;
		this.tName = tName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", tName=" + tName + ", email=" + email + "]";
	}


	

}
