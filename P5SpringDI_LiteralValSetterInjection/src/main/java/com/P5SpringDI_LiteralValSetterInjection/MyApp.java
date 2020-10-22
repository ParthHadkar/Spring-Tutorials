package com.P5SpringDI_LiteralValSetterInjection;

import com.P5SpringDI_LiteralValSetterInjection.Coach.BaseBallCoach;
import com.P5SpringDI_LiteralValSetterInjection.Coach.Coach;
import com.P5SpringDI_LiteralValSetterInjection.Coach.CricketCoach;
import com.P5SpringDI_LiteralValSetterInjection.FortuneService.FortuneService;
import com.P5SpringDI_LiteralValSetterInjection.FortuneService.HappyFortuneService;

public class MyApp {

	public static void main(String[] args) {
		//Create the Object 
		FortuneService fortuneService = new HappyFortuneService();
		//BaseBallCoach coach = new BaseBallCoach();
		CricketCoach coach = new CricketCoach();
		coach.setFortuneService(fortuneService);
		coach.setEmailId("sd");
		coach.setTeam("sd");
		// Use the Object
		System.out.println(coach.getDailyWorkOut());
		//let call fortune method of object
		System.out.println(coach.getDailyFortune());
		// calling literal method of the bean 
		System.out.println(coach.getEmailId());
		System.out.println(coach.getTeam());
	}

}
