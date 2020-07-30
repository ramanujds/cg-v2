package com.demo.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.demo.springmvc"})
public class WebCofig {
	
	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setSuffix(".jsp");
		return vr;
	}

}
