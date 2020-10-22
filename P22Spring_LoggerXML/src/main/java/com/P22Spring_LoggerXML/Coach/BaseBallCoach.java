package com.P22Spring_LoggerXML.Coach;

import com.P22Spring_LoggerXML.Coach.Coach;
import com.P22Spring_LoggerXML.FortuneService.FortuneService;

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
	
	//add an init mehod
	public void doStartup() {
		System.out.println("BaseBallCoach: inside  method - doStartup");
	}

	//add an destory method
	public void doCleanup() {
		System.out.println("BaseBallCoach: inside  method - doCleanup");
	}

}
