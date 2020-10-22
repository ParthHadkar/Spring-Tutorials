package com.P7Spring_BeanScopes.Coach;

import com.P7Spring_BeanScopes.Coach.Coach;
import com.P7Spring_BeanScopes.FortuneService.FortuneService;

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
