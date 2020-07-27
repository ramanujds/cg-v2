package com.capg.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	//Sim mySim=(Sim)context.getBean("vodafone");
    	Mobile m=context.getBean("mobile",Mobile.class);
    	//m.setSim(mySim);
        m.call();
        m.browse();
    }
}
