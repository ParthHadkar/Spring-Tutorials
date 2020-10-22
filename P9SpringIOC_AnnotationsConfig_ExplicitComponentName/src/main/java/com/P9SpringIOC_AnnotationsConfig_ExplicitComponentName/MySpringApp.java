package com.P9SpringIOC_AnnotationsConfig_ExplicitComponentName;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.P9SpringIOC_AnnotationsConfig_ExplicitComponentName.Coach.Coach;

public class MySpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file / create a context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		// retrieve bean from spring configuration file
		Coach  coach = applicationContext.getBean("CricketCoachs",Coach.class);//CricketCoachs BaseBallCoachs 
		// getting method of beans
		System.out.println(coach.getDailyWorkOut());
		// close the context
		applicationContext.close();

	}

}
