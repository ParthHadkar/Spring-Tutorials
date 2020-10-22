package com.P2SpringDI_ConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P2SpringDI_ConstructorInjection.BaseBallCoach.BaseBallCoach;
import com.P2SpringDI_ConstructorInjection.Coach.Coach;

public class MySpringApp {
	public static void main(String[] args) {
		// load the spring configuration file / create the context
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		// retrieve bean from spring container
		Coach coach = appContext.getBean("MyCoach",Coach.class);
		// calling method of the bean
		System.out.println(coach.getDailyWorkOut());
		// calling another method of the bean 
		System.out.println(coach.getDailyFortune());
		// close the context
		appContext.close();
	}
}
