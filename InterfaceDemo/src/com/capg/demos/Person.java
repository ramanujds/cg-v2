package com.capg.demos;

public class Person {

	public static void main(String[] args) {
		//Airtel airtelSim=new Airtel();
		Sim sim=new Vodafone();
		Mobile m=new Mobile();
		m.setSim(sim);
		m.browse();
	}
}
