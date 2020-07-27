package com.capg.demo.spring;

import java.util.Map;
import java.util.Set;

public class Vodafone implements Sim {

	private float browsingSpeed;
	private float callCharge;
private Map<String,Integer> supportedNetworks;
	
	
	
	
	public Map<String, Integer> getSupportedNetworks() {
	return supportedNetworks;
}



public void setSupportedNetworks(Map<String, Integer> supportedNetworks) {
	this.supportedNetworks = supportedNetworks;
}



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
	public void showSupportedNets() {
		System.out.println("Supported Networks - Years");
		supportedNetworks.forEach(
				(n,y)->System.out.printf("%-20s %-5d\n",n,y)
				);
	}


}
