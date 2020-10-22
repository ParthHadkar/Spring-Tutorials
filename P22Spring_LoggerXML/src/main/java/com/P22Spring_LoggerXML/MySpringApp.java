package com.P22Spring_LoggerXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P22Spring_LoggerXML.Coach.BaseBallCoach;
import com.P22Spring_LoggerXML.Coach.Coach;

public class MySpringApp {
	public static void main(String[] args) {
		// load the spring configuration file /create a context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		//retrieve the bean from spring container
		Coach coach = applicationContext.getBean("MyCoach",Coach.class);
		//calling method of the bean
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortune());
		// close the context
		applicationContext.close();
	}
}
