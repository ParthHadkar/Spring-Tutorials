package com.P4SpringDI_LiteralValConstructorInjection.Coach;

import com.P4SpringDI_LiteralValConstructorInjection.FortuneService.FortuneService;

public class CricketCoach implements Coach {

	// define a private field for Dependency
	private FortuneService fortuneService;
	
	private String emailId;
	private String team;

    public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");

    }
	
	//define a constructor for Dependency Injection
	public CricketCoach(FortuneService fortuneService) {  
		System.out.println("CricketCoach:inside arg constructor object");
		this.fortuneService = fortuneService;                      
	} 

	public CricketCoach(FortuneService fortuneService,String emailId, String team) {
		System.out.println("CricketCoach: inside arg constructor");
		this.fortuneService = fortuneService; 
		this.emailId = emailId;
		this.team = team;
	}
	
	public String getEmailId() {
		return emailId;
	}

	public String getTeam() {
		return team;
	}

	public String getDailyWorkOut() {
		return "Practice catching for 1 hour";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune() + " Let Rock";
	}

}
