package com.P11SpringDI_ConstructorInjectionAnnotation;

import com.P11SpringDI_ConstructorInjectionAnnotation.Coach.BaseBallCoach;
import com.P11SpringDI_ConstructorInjectionAnnotation.Coach.Coach;
import com.P11SpringDI_ConstructorInjectionAnnotation.Coach.CricketCoach;
import com.P11SpringDI_ConstructorInjectionAnnotation.FortuneService.FortuneService;
import com.P11SpringDI_ConstructorInjectionAnnotation.FortuneService.HappyFortuneService;

public class MyApp {

	public static void main(String[] args) {
		//Create the Object 
		FortuneService fortuneService = new HappyFortuneService();
		//BaseBallCoach coach = new BaseBallCoach(fortuneService);
		Coach coach = new CricketCoach(fortuneService);
		// Use the Object
		System.out.println(coach.getDailyWorkOut());
		//let call fortune method of object
		System.out.println(coach.getDailyFortune());
	}

}
