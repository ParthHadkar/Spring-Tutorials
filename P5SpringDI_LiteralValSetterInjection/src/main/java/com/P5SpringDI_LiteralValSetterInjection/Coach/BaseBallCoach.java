package com.P5SpringDI_LiteralValSetterInjection.Coach;

import com.P5SpringDI_LiteralValSetterInjection.FortuneService.FortuneService;

public class BaseBallCoach implements Coach {

	// define a private field for Dependency
	private FortuneService fortuneService;
	
	private String emailId;
	private String team;

	// Create a no-arg constructor
	public BaseBallCoach() {
		System.out.println("BaseBallCoach: inside no-arg constructor");
	}

	// define a setter for Dependency Injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("BaseBallCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		System.out.println("BaseBallCoach: inside setter method - setEmailId");
		this.emailId = emailId;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("BaseBallCoach: inside setter method - setTeam");
		this.team = team;
	}
	
	public String getDailyWorkOut() {
		return "Practice Batting For 30 min";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
