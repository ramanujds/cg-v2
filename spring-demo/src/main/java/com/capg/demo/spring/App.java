package com.capg.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	//Sim mySim=(Sim)context.getBean("vodafone");
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	Mobile m=context.getBean("mobile",Mobile.class);
    	//m.setSim(mySim);
        m.call();
        m.browse();
        m.showSupportedNets();
        m.getSim().setBrowsingSpeed(15.5f);
        m.getSim().setCallCharge(2.2f);
        
        Mobile m2=context.getBean("mobile",Mobile.class);
        m2.call();
        m2.browse();
        
        Sim sim=(Sim)context.getBean("airtel");
    }
}
