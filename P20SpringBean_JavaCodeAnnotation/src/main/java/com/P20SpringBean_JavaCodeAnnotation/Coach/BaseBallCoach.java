package com.P20SpringBean_JavaCodeAnnotation.Coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.P20SpringBean_JavaCodeAnnotation.Coach.Coach;
import com.P20SpringBean_JavaCodeAnnotation.FortuneService.FortuneService;

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
