package com.P17Spring_BeanScopesAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P17Spring_BeanScopesAnnotation.Coach.BaseBallCoach;
import com.P17Spring_BeanScopesAnnotation.Coach.Coach;

public class MySpringApp {
	public static void main(String[] args) {
		// load the spring configuration file /create a context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		//retrieve the bean from spring container
		Coach coach = applicationContext.getBean("baseBallCoach",Coach.class);//baseBallCoach
		
		Coach aplhaCoach = applicationContext.getBean("baseBallCoach",Coach.class);//cricketCoach
		
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
