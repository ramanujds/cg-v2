package com.capg.jpa.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Mobile {

	@Id
	int id;
	String model;
	String brand;
	float price;
	@ManyToMany
	List<Trainee> trainees=new ArrayList<Trainee>();
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(int id, String model, String brand, float price) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
	


	public List<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	
}
