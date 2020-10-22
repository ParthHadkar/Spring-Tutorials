package com.P4SpringDI_LiteralValConstructorInjection;

import com.P4SpringDI_LiteralValConstructorInjection.Coach.BaseBallCoach;
import com.P4SpringDI_LiteralValConstructorInjection.Coach.Coach;
import com.P4SpringDI_LiteralValConstructorInjection.Coach.CricketCoach;
import com.P4SpringDI_LiteralValConstructorInjection.FortuneService.FortuneService;
import com.P4SpringDI_LiteralValConstructorInjection.FortuneService.HappyFortuneService;

public class MyApp {

	public static void main(String[] args) {
		//Create the Object 
		FortuneService fortuneService = new HappyFortuneService();
		//BaseBallCoach coach = new BaseBallCoach(fortuneService);
		CricketCoach coach = new CricketCoach(fortuneService,"p@gmail.com","mi");
		// Use the Object
		System.out.println(coach.getDailyWorkOut());
		//let call fortune method of object
		//System.out.println(coach.getDailyFortune());
		// calling literal method of the bean 
		System.out.println(coach.getEmailId());
		System.out.println(coach.getTeam());
	}

}
