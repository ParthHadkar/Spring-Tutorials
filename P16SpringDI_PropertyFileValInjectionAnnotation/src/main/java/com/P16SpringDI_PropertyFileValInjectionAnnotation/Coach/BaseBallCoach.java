package com.P16SpringDI_PropertyFileValInjectionAnnotation.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.P16SpringDI_PropertyFileValInjectionAnnotation.FortuneService.FortuneService;

@Component
public class BaseBallCoach implements Coach {

	// define a private field for Dependency
	private FortuneService fortuneService;
	
	@Value("${ch.EmailId}")
	private String emailId;
	@Value("${ch.Team}")
	private String team;

	// Create a no-arg constructor
	public BaseBallCoach() {
		System.out.println("BaseBallCoach: inside no-arg constructor");
	}

	@Autowired
	//define a constructor for Dependency Injection
	public BaseBallCoach(@Qualifier("happyFortuneService")FortuneService fortuneService) {
		System.out.println("BaseBallCoach: inside arg constructor object");
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
