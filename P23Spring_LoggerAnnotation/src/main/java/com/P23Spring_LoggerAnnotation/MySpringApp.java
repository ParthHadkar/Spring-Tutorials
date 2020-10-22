package com.P23Spring_LoggerAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P23Spring_LoggerAnnotation.Coach.CricketCoach;
import com.P23Spring_LoggerAnnotation.Config.LoggerConfig;
import com.P23Spring_LoggerAnnotation.Config.SpringConfig;
import com.P23Spring_LoggerAnnotation.Coach.BaseBallCoach;
import com.P23Spring_LoggerAnnotation.Coach.Coach;

public class MySpringApp {
	public static void main(String[] args) {
		// read the spring configuration  java class /create a context
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LoggerConfig.class,SpringConfig.class);
		//retrieve the bean from spring container
		CricketCoach coach = applicationContext.getBean("cricketCoach",CricketCoach.class);
		//BaseBallCoach coach = applicationContext.getBean("baseBallCoach",BaseBallCoach.class);//baseBallCoach cricketCoach
		//calling method of the bean
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortune());
		// calling literal method of the bean 
		System.out.println(coach.getEmailId());
		System.out.println(coach.getTeam());
		// close the context
		applicationContext.close();
	}
}
