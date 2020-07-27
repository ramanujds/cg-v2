package com.capg.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile {
	
	@Autowired
	@Qualifier("vodafone")
	private Sim sim;

	
	
//	public Sim getSim() {
//		return sim;
//	}
//
//	public void setSim(Sim sim) {
//		this.sim = sim;
//	}

	void call() {
		if(sim==null) {
			System.out.println("Please insert a SIM Card First");
		}
		else {
		sim.call();
		}
	}
	
	void browse() {
		if(sim==null) {
			System.out.println("Please insert a SIM Card First");
		}
		else {
		sim.browse();
		}
	}
	public void showSupportedNets() {
		if(sim==null) {
			System.out.println("Please insert a SIM Card First");
		}
		else {
		sim.showSupportedNets();
		}
	}
	
}
