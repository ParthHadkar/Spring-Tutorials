package com.P8Spring_BeanLifeCycle.Coach;

import com.P8Spring_BeanLifeCycle.Coach.Coach;
import com.P8Spring_BeanLifeCycle.FortuneService.FortuneService;

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
	
	//add an init mehod
	public void doStartup() {
		System.out.println("CricketCoach: inside  method - doStartup");
	}

	//add an destory method
	public void doCleanup() {
		System.out.println("CricketCoach: inside  method - doCleanup");
	}

}
