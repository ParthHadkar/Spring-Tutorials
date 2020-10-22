package com.P6SpringDI_PropertyFileValInjection;

import com.P6SpringDI_PropertyFileValInjection.Coach.BaseBallCoach;
import com.P6SpringDI_PropertyFileValInjection.Coach.Coach;
import com.P6SpringDI_PropertyFileValInjection.Coach.CricketCoach;
import com.P6SpringDI_PropertyFileValInjection.FortuneService.FortuneService;
import com.P6SpringDI_PropertyFileValInjection.FortuneService.HappyFortuneService;

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
