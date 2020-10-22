package com.P7Spring_BeanScopes;

import com.P7Spring_BeanScopes.Coach.BaseBallCoach;
import com.P7Spring_BeanScopes.Coach.Coach;
import com.P7Spring_BeanScopes.Coach.CricketCoach;
import com.P7Spring_BeanScopes.FortuneService.FortuneService;
import com.P7Spring_BeanScopes.FortuneService.HappyFortuneService;

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
