package com.P11SpringDI_ConstructorInjectionAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P11SpringDI_ConstructorInjectionAnnotation.Coach.BaseBallCoach;
import com.P11SpringDI_ConstructorInjectionAnnotation.Coach.Coach;
import com.P11SpringDI_ConstructorInjectionAnnotation.Coach.CricketCoach;

public class MySpringApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file / create a context
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		// retrive bean from spring container 
		//BaseBallCoach coach = appContext.getBean("MyCoach",BaseBallCoach.class);
		Coach coach = appContext.getBean("cricketCoach",Coach.class);//cricketCoach baseBallCoach
		//let check print statement
		// calling method of the bean
		System.out.println(coach.getDailyWorkOut());
		// calling another method of the bean 
		System.out.println(coach.getDailyFortune());
		// close the context
		appContext.close();  
	}

}
