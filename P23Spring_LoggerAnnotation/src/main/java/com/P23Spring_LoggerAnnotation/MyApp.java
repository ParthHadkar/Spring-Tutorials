package com.P23Spring_LoggerAnnotation;

import com.P23Spring_LoggerAnnotation.Coach.BaseBallCoach;
import com.P23Spring_LoggerAnnotation.Coach.Coach;
import com.P23Spring_LoggerAnnotation.Coach.CricketCoach;
import com.P23Spring_LoggerAnnotation.FortuneService.FortuneService;
import com.P23Spring_LoggerAnnotation.FortuneService.HappyFortuneService;

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
