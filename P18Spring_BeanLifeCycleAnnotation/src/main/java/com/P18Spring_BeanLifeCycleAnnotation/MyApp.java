package com.P18Spring_BeanLifeCycleAnnotation;

import com.P18Spring_BeanLifeCycleAnnotation.Coach.BaseBallCoach;
import com.P18Spring_BeanLifeCycleAnnotation.Coach.Coach;
import com.P18Spring_BeanLifeCycleAnnotation.Coach.CricketCoach;
import com.P18Spring_BeanLifeCycleAnnotation.FortuneService.FortuneService;
import com.P18Spring_BeanLifeCycleAnnotation.FortuneService.HappyFortuneService;

public class MyApp {
	
	public static void main(String[] args) {
		
		//Create the Object 
		//FortuneService fortuneService = new HappyFortuneService();
		//Coach coach = new BaseBallCoach(fortuneService);
		Coach coach = new CricketCoach();
		// Use the Object
		System.out.println(coach.getDailyWorkOut());
		//let call fortune method of object
		//System.out.println(coach.getDailyFortune());
	}

}
