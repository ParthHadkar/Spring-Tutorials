package com.P18Spring_BeanLifeCycleAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P18Spring_BeanLifeCycleAnnotation.Coach.BaseBallCoach;
import com.P18Spring_BeanLifeCycleAnnotation.Coach.Coach;

public class MySpringApp {
	public static void main(String[] args) {
		// load the spring configuration file /create a context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		//retrieve the bean from spring container
		Coach coach = applicationContext.getBean("baseBallCoach",Coach.class);//baseBallCoach cricketCoach
		//calling method of the bean
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortune());
		// close the context
		applicationContext.close();
	}
}
