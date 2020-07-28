package com.capg.demo.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mobile")
@Lazy
@Scope("prototype")
public class Mobile implements InitializingBean,DisposableBean {

	@Autowired
	@Qualifier("vodafone")
	private Sim sim;
	
	@PostConstruct
	public void init() {
		System.out.println("Mobile Initialized through init method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Mobile Initialized through afterPropertiesSet()");
	}

	public Mobile() {
		System.out.println("Mobile Object Created");
	}

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	void call() {
		if (sim == null) {
			System.out.println("Please insert a SIM Card First");
		} else {
			sim.call();
		}
	}

	void browse() {
		if (sim == null) {
			System.out.println("Please insert a SIM Card First");
		} else {
			sim.browse();
		}
	}

	public void showSupportedNets() {
		if (sim == null) {
			System.out.println("Please insert a SIM Card First");
		} else {
			sim.showSupportedNets();
		}
	}
	@Override
	public void destroy() throws Exception {
	System.out.println("Mobile Destroyed");	
	}
	
	@PreDestroy
	public void destruct() {
		System.out.println("Mobile Destroyed");
	}

}
