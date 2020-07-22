package com.capg.demos;

public class Mobile {
	
	Sim sim;
	
	

	
	
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	void call() {
		sim.call();
	}
	void browse() {
		sim.browse();
	}
	

}
