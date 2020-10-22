package com.P3SpringDI_SetterInjection;

import com.P3SpringDI_SetterInjection.Coach.BaseBallCoach;
import com.P3SpringDI_SetterInjection.Coach.Coach;
import com.P3SpringDI_SetterInjection.Coach.CricketCoach;
import com.P3SpringDI_SetterInjection.FortuneService.FortuneService;
import com.P3SpringDI_SetterInjection.FortuneService.HappyFortuneService;

public class MyApp {

	public static void main(String[] args) {
		// Create the Object
		FortuneService fortuneService = new HappyFortuneService();
		BaseBallCoach coach = new BaseBallCoach();
		//CricketCoach coach = new CricketCoach();
		coach.setFortuneService(fortuneService);
		// Use the Object
		System.out.println(coach.getDailyWorkOut());
		// let call fortune method of object
		// System.out.println(coach.getDailyFortune());
	}

}
