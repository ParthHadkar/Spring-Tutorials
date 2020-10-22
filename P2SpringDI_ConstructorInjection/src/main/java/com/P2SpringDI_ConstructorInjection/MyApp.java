package com.P2SpringDI_ConstructorInjection;

import com.P2SpringDI_ConstructorInjection.BaseBallCoach.BaseBallCoach;
import com.P2SpringDI_ConstructorInjection.Coach.Coach;
import com.P2SpringDI_ConstructorInjection.CricketCoach.CricketCoach;
import com.P2SpringDI_ConstructorInjection.FortuneService.FortuneService;
import com.P2SpringDI_ConstructorInjection.HappyFortuneService.HappyFortuneService;

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
