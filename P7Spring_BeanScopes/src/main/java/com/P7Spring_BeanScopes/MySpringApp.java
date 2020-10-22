package com.P7Spring_BeanScopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P7Spring_BeanScopes.Coach.BaseBallCoach;
import com.P7Spring_BeanScopes.Coach.Coach;

public class MySpringApp {
	public static void main(String[] args) {
		// load the spring configuration file /create a context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		//retrieve the bean from spring container
		Coach coach = applicationContext.getBean("MyCoach",Coach.class);
		
		Coach aplhaCoach = applicationContext.getBean("MyCoach",Coach.class);
		
		// check if both the object are same
		//checking object reference if they are point to same memory location or same object
		boolean result = (coach == aplhaCoach);
		//printing out the result
		System.out.println("\npointing to same object : "+result);
		System.out.println("\nMemory location of coach: "+coach);
		System.out.println("\nMemory location of aplhaCoach: "+aplhaCoach);
		// close the context
		applicationContext.close();
	}
}
