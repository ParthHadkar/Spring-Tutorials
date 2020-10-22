package com.P2SpringDI_ConstructorInjection.BaseBallCoach;

import com.P2SpringDI_ConstructorInjection.Coach.Coach;
import com.P2SpringDI_ConstructorInjection.FortuneService.FortuneService;

public class BaseBallCoach implements Coach{
	
	//define a private feild for Dependency
	private FortuneService fortuneService;
	
	//define a constructor for Dependency Injection
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkOut() {
		return "Practice Batting For 30 min";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
