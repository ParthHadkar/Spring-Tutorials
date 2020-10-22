package com.P23Spring_LoggerAnnotation.Coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

import com.P23Spring_LoggerAnnotation.Coach.Coach;
import com.P23Spring_LoggerAnnotation.FortuneService.FortuneService;

public class BaseBallCoach implements Coach{
	
	//define a private feild for Dependency
	private FortuneService fortuneService;
	
	@Value("${sport.EmailId}")
	private String emailId;
	@Value("${sport.Team}")
	private String team;
	
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
		System.out.println("BaseBallCoach: inside  method - doStartup");
	}

	//add an destory method
	@PreDestroy
	public void doCleanup() {
		System.out.println("BaseBallCoach: inside  method - doCleanup");
	}

}
