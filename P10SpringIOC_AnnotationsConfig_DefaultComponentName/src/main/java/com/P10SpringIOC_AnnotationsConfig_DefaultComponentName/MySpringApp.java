package com.P10SpringIOC_AnnotationsConfig_DefaultComponentName;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P10SpringIOC_AnnotationsConfig_DefaultComponentName.Coach.Coach;

public class MySpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file / create a context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		// retrieve bean from spring configuration file
		Coach  coach = applicationContext.getBean("cricketCoach",Coach.class);//cricketCoach baseBallCoach 
		// getting method of beans
		System.out.println(coach.getDailyWorkOut());
		// close the context
		applicationContext.close();

	}

}
