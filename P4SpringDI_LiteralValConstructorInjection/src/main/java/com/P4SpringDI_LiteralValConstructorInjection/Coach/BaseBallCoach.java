package com.P4SpringDI_LiteralValConstructorInjection.Coach;

import com.P4SpringDI_LiteralValConstructorInjection.FortuneService.FortuneService;

public class BaseBallCoach implements Coach {

	// define a private field for Dependency
	private FortuneService fortuneService;
	
	private String emailId;
	private String team;

	// Create a no-arg constructor
	public BaseBallCoach() {
		System.out.println("BaseBallCoach: inside no-arg constructor");
	}

	//define a constructor for Dependency Injection
	public BaseBallCoach(FortuneService fortuneService) {
		System.out.println("BaseBallCoach: inside arg constructor object");
		this.fortuneService = fortuneService;
	}

	public BaseBallCoach(FortuneService fortuneService,String emailId, String team) {
		System.out.println("BaseBallCoach: inside arg constructor");
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
		return "Practice Batting For 30 min";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
