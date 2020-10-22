package com.P12SpringDI_SetterInjectionAnnotation.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.P12SpringDI_SetterInjectionAnnotation.FortuneService.FortuneService;

@Component
public class BaseBallCoach implements Coach {

	// define a private field for Dependency
	private FortuneService fortuneService;

	// Create a no-arg constructor
	public BaseBallCoach() {
		System.out.println("BaseBallCoach: inside no-arg constructor");
	}

	@Autowired
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
