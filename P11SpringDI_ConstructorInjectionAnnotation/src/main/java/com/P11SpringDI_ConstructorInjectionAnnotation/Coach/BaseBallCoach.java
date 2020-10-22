package com.P11SpringDI_ConstructorInjectionAnnotation.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.P11SpringDI_ConstructorInjectionAnnotation.FortuneService.FortuneService;

@Component
public class BaseBallCoach implements Coach {

	// define a private field for Dependency
	private FortuneService fortuneService;
	
	// Create a no-arg constructor
	public BaseBallCoach() {
		System.out.println("BaseBallCoach: inside no-arg constructor");
	}

	@Autowired
	//define a constructor for Dependency Injection
	public BaseBallCoach(FortuneService fortuneService) {
		System.out.println("BaseBallCoach: inside arg constructor object");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkOut() {
		return "Practice Batting For 30 min";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
