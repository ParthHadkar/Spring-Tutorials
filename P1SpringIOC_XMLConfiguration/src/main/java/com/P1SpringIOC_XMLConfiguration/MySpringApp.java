package com.P1SpringIOC_XMLConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P1SpringIOC_XMLConfiguration.Coach.Coach;

public class MySpringApp {

	public static void main(String[] args) {
		
		// load spring configuration file / creating the context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		// retrieve bean from spring container
		Coach coach = applicationContext.getBean("MyCoach",Coach.class);
		// call method of the bean
		System.out.println(coach.getDailyWorkout());
		// close the context
		applicationContext.close();
	}

}
