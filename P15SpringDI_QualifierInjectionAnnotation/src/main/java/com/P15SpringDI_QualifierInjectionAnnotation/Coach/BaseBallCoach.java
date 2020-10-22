package com.P15SpringDI_QualifierInjectionAnnotation.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.P15SpringDI_QualifierInjectionAnnotation.FortuneService.FortuneService;

@Component
public class BaseBallCoach implements Coach {

	@Autowired //Field Injection Which Use Java Reflection Internally
	@Qualifier("happyFortuneService")
	// define a private field for Dependency
	private FortuneService fortuneService;

	// Create a no-arg constructor
	public BaseBallCoach() {
		System.out.println("BaseBallCoach: inside no-arg constructor");
	}


	public String getDailyWorkOut() {
		return "Practice Batting For 30 min";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
