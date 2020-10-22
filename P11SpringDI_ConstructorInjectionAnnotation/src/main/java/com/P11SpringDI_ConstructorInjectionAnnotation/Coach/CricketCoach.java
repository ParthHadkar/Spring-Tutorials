package com.P11SpringDI_ConstructorInjectionAnnotation.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.P11SpringDI_ConstructorInjectionAnnotation.FortuneService.FortuneService;

@Component
public class CricketCoach implements Coach {

	// define a private field for Dependency
	private FortuneService fortuneService;
	
    public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");

    }
	
    @Autowired
	//define a constructor for Dependency Injection
	public CricketCoach(FortuneService fortuneService) {  
		System.out.println("CricketCoach:inside arg constructor object");
		this.fortuneService = fortuneService;                      
	} 


	public String getDailyWorkOut() {
		return "Practice catching for 1 hour";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune() + " Let Rock";
	}

}
