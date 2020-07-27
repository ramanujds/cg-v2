package com.capg.demo.spring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.capg.demo.spring"})
public class AppConfig {
	
	@Bean(name = "airtel")
	public Airtel getAirtelBean() {
		Airtel airtel=new Airtel(2.5f,25.5f);
		List<String> netList=Arrays.asList("Edge","HSPA","LTE");
		airtel.setSupportedNetworks(netList);
		return airtel;
	}
	
	@Bean(name = "vodafone")
	public Vodafone getVodafoneBean() {
		Vodafone vf=new Vodafone();
		vf.setCallCharge(1.5f);
		vf.setBrowsingSpeed(10.6f);
		Map<String, Integer> nets=new HashMap<>();
		nets.put("EGDE", 2008);
		nets.put("HSPA", 2010);
		nets.put("LTE", 2016);
		vf.setSupportedNetworks(nets);
		return vf;
	}

//	@Bean(name = "mobile")
//	public Mobile getMobileBean() {
//		Mobile m=new Mobile();
////		m.setSim(getVodafoneBean());
//		return m;
//	}
	
}
