package com.P19SpringConfig_JavaCodeAnnotation;

import com.P19SpringConfig_JavaCodeAnnotation.Coach.BaseBallCoach;
import com.P19SpringConfig_JavaCodeAnnotation.Coach.Coach;
import com.P19SpringConfig_JavaCodeAnnotation.Coach.CricketCoach;
import com.P19SpringConfig_JavaCodeAnnotation.FortuneService.FortuneService;
import com.P19SpringConfig_JavaCodeAnnotation.FortuneService.HappyFortuneService;

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
