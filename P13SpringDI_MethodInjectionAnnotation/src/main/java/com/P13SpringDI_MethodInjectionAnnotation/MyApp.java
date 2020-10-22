package com.P13SpringDI_MethodInjectionAnnotation;

import com.P13SpringDI_MethodInjectionAnnotation.Coach.BaseBallCoach;
import com.P13SpringDI_MethodInjectionAnnotation.Coach.Coach;
import com.P13SpringDI_MethodInjectionAnnotation.Coach.CricketCoach;
import com.P13SpringDI_MethodInjectionAnnotation.FortuneService.FortuneService;
import com.P13SpringDI_MethodInjectionAnnotation.FortuneService.HappyFortuneService;

public class MyApp {

	public static void main(String[] args) {
		// Create the Object
		FortuneService fortuneService = new HappyFortuneService();
		BaseBallCoach coach = new BaseBallCoach();
		//CricketCoach coach = new CricketCoach();
		coach.addFortuneService(fortuneService);
		// Use the Object
		System.out.println(coach.getDailyWorkOut());
		// let call fortune method of object
		// System.out.println(coach.getDailyFortune());
	}

}
