package com.P12SpringDI_SetterInjectionAnnotation;

import com.P12SpringDI_SetterInjectionAnnotation.Coach.BaseBallCoach;
import com.P12SpringDI_SetterInjectionAnnotation.Coach.Coach;
import com.P12SpringDI_SetterInjectionAnnotation.Coach.CricketCoach;
import com.P12SpringDI_SetterInjectionAnnotation.FortuneService.FortuneService;
import com.P12SpringDI_SetterInjectionAnnotation.FortuneService.HappyFortuneService;

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
