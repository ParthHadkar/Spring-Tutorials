package com.P14SpringDI_FieldInjectionAnnotation.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.P14SpringDI_FieldInjectionAnnotation.FortuneService.FortuneService;

@ Component
public class CricketCoach implements Coach {

	@Autowired //Field Injection Which Use Java Reflection Internally
	// define a private field for Dependency
	private FortuneService fortuneService;

	// Create a no-arg constructor
	
	public CricketCoach() {
	  System.out.println("CricketCoach: inside no-arg constructor");
	}
	 

	public String getDailyWorkOut() {
		return "Practice catching for 1 hour";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune() + " Let Rock";
	}

}
