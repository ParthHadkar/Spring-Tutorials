package com.P6SpringDI_PropertyFileValInjection.Coach;

import com.P6SpringDI_PropertyFileValInjection.FortuneService.FortuneService;

public class CricketCoach implements Coach {

	// define a private field for Dependency
	private FortuneService fortuneService;
	
	private String emailId;
	private String team;

	// Create a no-arg constructor
	
	  public CricketCoach() {
	  System.out.println("CricketCoach: inside no-arg constructor"); 
	  }
	 

	// define a setter for Dependency Injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		System.out.println("CricketCoach: inside setter method - setEmailId");
		this.emailId = emailId;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	public String getDailyWorkOut() {
		return "Practice catching for 1 hour";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune() + " Let Rock";
	}

}
