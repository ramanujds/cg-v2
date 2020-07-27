package com.capg.demo.spring;

public class Mobile {
	
	private Sim sim;

	
	
	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

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
	
}
