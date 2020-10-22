package com.P20SpringBean_JavaCodeAnnotation.Coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.P20SpringBean_JavaCodeAnnotation.Coach.Coach;
import com.P20SpringBean_JavaCodeAnnotation.FortuneService.FortuneService;

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
