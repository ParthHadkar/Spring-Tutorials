package com.P14SpringDI_FieldInjectionAnnotation;

import com.P14SpringDI_FieldInjectionAnnotation.Coach.BaseBallCoach;
import com.P14SpringDI_FieldInjectionAnnotation.Coach.Coach;
import com.P14SpringDI_FieldInjectionAnnotation.Coach.CricketCoach;
import com.P14SpringDI_FieldInjectionAnnotation.FortuneService.FortuneService;
import com.P14SpringDI_FieldInjectionAnnotation.FortuneService.HappyFortuneService;

public class MyApp {

	public static void main(String[] args) {
		// Create the Object
		FortuneService fortuneService = new HappyFortuneService();
		BaseBallCoach coach = new BaseBallCoach();
		//CricketCoach coach = new CricketCoach();
		// Use the Object
		System.out.println(coach.getDailyWorkOut());
		// let call fortune method of object
		// System.out.println(coach.getDailyFortune());
	}

}
