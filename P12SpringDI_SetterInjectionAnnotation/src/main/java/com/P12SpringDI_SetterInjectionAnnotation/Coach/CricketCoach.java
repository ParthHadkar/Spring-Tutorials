package com.P12SpringDI_SetterInjectionAnnotation.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.P12SpringDI_SetterInjectionAnnotation.FortuneService.FortuneService;

@ Component
public class CricketCoach implements Coach {

	// define a private field for Dependency
	private FortuneService fortuneService;

	// Create a no-arg constructor
	
	public CricketCoach() {
	  System.out.println("CricketCoach: inside no-arg constructor");
	}
	 
	@Autowired
	// define a setter for Dependency Injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkOut() {
		return "Practice catching for 1 hour";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune() + " Let Rock";
	}

}
