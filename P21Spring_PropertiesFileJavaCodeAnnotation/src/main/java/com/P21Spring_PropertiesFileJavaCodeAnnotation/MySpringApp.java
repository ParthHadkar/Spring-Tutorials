package com.P21Spring_PropertiesFileJavaCodeAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P21Spring_PropertiesFileJavaCodeAnnotation.Coach.BaseBallCoach;
import com.P21Spring_PropertiesFileJavaCodeAnnotation.Coach.Coach;
import com.P21Spring_PropertiesFileJavaCodeAnnotation.Coach.CricketCoach;
import com.P21Spring_PropertiesFileJavaCodeAnnotation.Config.SpringConfig;

public class MySpringApp {
	public static void main(String[] args) {
		// read the spring configuration  java class /create a context
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
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
