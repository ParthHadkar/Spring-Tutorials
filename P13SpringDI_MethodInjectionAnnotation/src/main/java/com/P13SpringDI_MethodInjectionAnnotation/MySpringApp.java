package com.P13SpringDI_MethodInjectionAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P13SpringDI_MethodInjectionAnnotation.Coach.Coach;

public class MySpringApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file / create a context
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		// retrive bean from spring container 
		Coach coach = appContext.getBean("cricketCoach",Coach.class);//baseBallCoach cricketCoach
		//let check print statement
		// calling method of the bean
		System.out.println(coach.getDailyWorkOut());
		// calling another method of the bean 
		System.out.println(coach.getDailyFortune());
		// close the context
		appContext.close();  
	}

}
