package com.P15SpringDI_QualifierInjectionAnnotation;

import com.P15SpringDI_QualifierInjectionAnnotation.Coach.BaseBallCoach;
import com.P15SpringDI_QualifierInjectionAnnotation.Coach.Coach;
import com.P15SpringDI_QualifierInjectionAnnotation.Coach.CricketCoach;
import com.P15SpringDI_QualifierInjectionAnnotation.FortuneService.FortuneService;
import com.P15SpringDI_QualifierInjectionAnnotation.FortuneService.HappyFortuneService;

public class MyApp {

	public static void main(String[] args) {
		// Create the Object
		FortuneService fortuneService = new HappyFortuneService();
		BaseBallCoach coach = new BaseBallCoach();
		// CricketCoach coach = new CricketCoach();
		// Use the Object
		System.out.println(coach.getDailyWorkOut());
		// let call fortune method of object
		// System.out.println(coach.getDailyFortune());
	}

}
