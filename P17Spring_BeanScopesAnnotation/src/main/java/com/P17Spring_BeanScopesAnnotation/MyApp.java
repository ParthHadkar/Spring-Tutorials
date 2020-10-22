package com.P17Spring_BeanScopesAnnotation;

import com.P17Spring_BeanScopesAnnotation.Coach.BaseBallCoach;
import com.P17Spring_BeanScopesAnnotation.Coach.Coach;
import com.P17Spring_BeanScopesAnnotation.Coach.CricketCoach;
import com.P17Spring_BeanScopesAnnotation.FortuneService.FortuneService;
import com.P17Spring_BeanScopesAnnotation.FortuneService.HappyFortuneService;

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
