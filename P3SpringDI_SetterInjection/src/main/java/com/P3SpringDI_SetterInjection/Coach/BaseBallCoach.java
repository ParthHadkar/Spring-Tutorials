package com.P3SpringDI_SetterInjection.Coach;

import com.P3SpringDI_SetterInjection.FortuneService.FortuneService;

public class BaseBallCoach implements Coach {

	// define a private field for Dependency
	private FortuneService fortuneService;

	// Create a no-arg constructor
	public BaseBallCoach() {
		System.out.println("BaseBallCoach: inside no-arg constructor");
	}

	// define a setter for Dependency Injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("BaseBallCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkOut() {
		return "Practice Batting For 30 min";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
