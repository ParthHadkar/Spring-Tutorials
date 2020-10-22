package com.P23Spring_LoggerAnnotation.Coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

import com.P23Spring_LoggerAnnotation.Coach.Coach;
import com.P23Spring_LoggerAnnotation.FortuneService.FortuneService;

public class CricketCoach implements Coach {

	//define a private field for Dependency
	private FortuneService fortuneService;
	
	@Value("${sport.EmailId}")
	private String emailId;
	@Value("${sport.Team}")
	private String team;
	
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
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	//add an init mehod
	@PostConstruct
	public void doStartup() {
		System.out.println("CricketCoach: inside  method - doStartup");
	}

	//add an destory method
	@PreDestroy
	public void doCleanup() {
		System.out.println("CricketCoach: inside  method - doCleanup");
	}

}
