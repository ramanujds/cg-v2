package com.capg.jpa.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trainee_data")
@NamedQuery(name = "findByEmail", query = "from Trainee where email=:email")
public class Trainee {
	

	@Id
	int id;
	@Column(name = "trainee_name")
	String name;
	@Column(unique = true)
	String email;
	@ManyToMany(mappedBy = "trainees",fetch = FetchType.EAGER)
	List<Mobile> mobiles=new ArrayList<Mobile>();
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	public Trainee(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	
	
	
	public List<Mobile> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", email=" + email+ "]";
	}
	
	//+", mobile=" +mobiles

}
