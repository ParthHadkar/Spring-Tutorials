package com.P13SpringDI_MethodInjectionAnnotation.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.P13SpringDI_MethodInjectionAnnotation.FortuneService.FortuneService;

@ Component
public class CricketCoach implements Coach {

	// define a private field for Dependency
	private FortuneService fortuneService;

	// Create a no-arg constructor
	
	public CricketCoach() {
	  System.out.println("CricketCoach: inside no-arg constructor");
	}
	 
	@Autowired
	// define a method for Dependency Injection
	public void addFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside custom method - addFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkOut() {
		return "Practice catching for 1 hour";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune() + " Let Rock";
	}

}
