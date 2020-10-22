package com.P3SpringDI_SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P3SpringDI_SetterInjection.Coach.Coach;

public class MySpringApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file / create a context
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		// retrive bean from spring container 
		Coach coach = appContext.getBean("MyCoach",Coach.class);
		//let check print statement
		// calling method of the bean
		System.out.println(coach.getDailyWorkOut());
		// calling another method of the bean 
		System.out.println(coach.getDailyFortune());
		// close the context
		appContext.close();  
	}

}
