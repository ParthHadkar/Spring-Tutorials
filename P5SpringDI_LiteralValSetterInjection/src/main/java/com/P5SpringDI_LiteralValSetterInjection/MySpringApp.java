package com.P5SpringDI_LiteralValSetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P5SpringDI_LiteralValSetterInjection.Coach.BaseBallCoach;
import com.P5SpringDI_LiteralValSetterInjection.Coach.Coach;
import com.P5SpringDI_LiteralValSetterInjection.Coach.CricketCoach;

public class MySpringApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file / create a context
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		// retrive bean from spring container 
		//BaseBallCoach coach = appContext.getBean("MyCoach",BaseBallCoach.class);
		CricketCoach coach = appContext.getBean("MyCoach",CricketCoach.class);
		//let check print statement
		// calling method of the bean
		System.out.println(coach.getDailyWorkOut());
		// calling another method of the bean 
		System.out.println(coach.getDailyFortune());
		// calling literal method of the bean 
		System.out.println(coach.getEmailId());
		System.out.println(coach.getTeam());
		// close the context
		appContext.close();  
	}

}
