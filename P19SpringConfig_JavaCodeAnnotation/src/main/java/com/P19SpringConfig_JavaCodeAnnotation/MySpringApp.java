package com.P19SpringConfig_JavaCodeAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P19SpringConfig_JavaCodeAnnotation.Coach.BaseBallCoach;
import com.P19SpringConfig_JavaCodeAnnotation.Coach.Coach;
import com.P19SpringConfig_JavaCodeAnnotation.Config.SpringConfig;

public class MySpringApp {
	public static void main(String[] args) {
		// read the spring configuration  java class /create a context
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		//retrieve the bean from spring container
		Coach coach = applicationContext.getBean("cricketCoach",Coach.class);//baseBallCoach cricketCoach
		//calling method of the bean
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortune());
		// close the context
		applicationContext.close();
	}
}
