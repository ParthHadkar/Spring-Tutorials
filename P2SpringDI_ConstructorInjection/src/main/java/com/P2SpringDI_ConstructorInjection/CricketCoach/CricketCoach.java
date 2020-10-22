package com.P2SpringDI_ConstructorInjection.CricketCoach;

import com.P2SpringDI_ConstructorInjection.Coach.Coach;
import com.P2SpringDI_ConstructorInjection.FortuneService.FortuneService;

public class CricketCoach implements Coach {

	//define a private field for Dependency
	private FortuneService fortuneService;
	
	public CricketCoach() {}
	
	//define a constructor for Dependency Injection
	public CricketCoach(FortuneService fortuneService) {           
		this.fortuneService = fortuneService;                      
	}                                                              

	public String getDailyWorkOut() {
		return "Practice catching for 1 hour";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune()+" Let Rock";
	}

}
