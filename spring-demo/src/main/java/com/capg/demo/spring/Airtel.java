package com.capg.demo.spring;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("airtel")
@Lazy
@Scope("prototype")
public class Airtel implements Sim, InitializingBean {

	@Value("${airtel.browsingSpeed}")
	private float browsingSpeed;
	@Value("${airtel.callCharge}")
	private float callCharge;
	@Value("#{${airtel.supportedNetworks}}")
	private List<String> supportedNetworks;
	
	
	
	public List<String> getSupportedNetworks() {
		return supportedNetworks;
	}

	public void setSupportedNetworks(List<String> supportedNetworks) {
		this.supportedNetworks = supportedNetworks;
	}

	public Airtel() {
		System.out.println("Airtel Bean Created");
	}
	
	public Airtel(float browsingSpeed, float callCharge) {
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
		System.out.println("Callig with Airtel.. Charges - €"+callCharge);

	}

	public void browse() {
		System.out.println("Browsing with Airtel.. Speed - "+browsingSpeed+"mb/s");

	}
	
	public void showSupportedNets() {
		System.out.println("Supported Networks are - ");
		supportedNetworks.forEach(n->System.out.println(n));
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Airtel Sim Initialized");
		
	}

}
