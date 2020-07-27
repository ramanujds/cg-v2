package com.capg.demo.spring;

public class Vodafone implements Sim {

	private float browsingSpeed;
	private float callCharge;
	
	public Vodafone() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Vodafone(float browsingSpeed, float callCharge) {
		System.out.println("Setting up properties through Constructor");
		this.browsingSpeed = browsingSpeed;
		this.callCharge = callCharge;
	}



	public float getBrowsingSpeed() {
		return browsingSpeed;
	}

	public void setBrowsingSpeed(float browsingSpeed) {
		System.out.println("Setting up the Browsing Speed...");
		this.browsingSpeed = browsingSpeed;
	}

	public float getCallCharge() {
		return callCharge;
	}

	public void setCallCharge(float callCharge) {
		System.out.println("Setting up the Call Charges...");
		this.callCharge = callCharge;
	}
	public void call() {
		System.out.println("Callig with Vodafone.. Charges - €"+callCharge);

	}

	public void browse() {
		System.out.println("Browsing with Vodafone.. Speed - "+browsingSpeed+"mb/s");

	}


}
