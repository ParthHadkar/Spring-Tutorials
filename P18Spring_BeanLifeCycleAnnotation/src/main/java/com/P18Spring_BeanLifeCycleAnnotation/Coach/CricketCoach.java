package com.P18Spring_BeanLifeCycleAnnotation.Coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.P18Spring_BeanLifeCycleAnnotation.Coach.Coach;
import com.P18Spring_BeanLifeCycleAnnotation.FortuneService.FortuneService;

@Component
@Scope("singleton")
public class CricketCoach implements Coach {

	//define a private field for Dependency
	private FortuneService fortuneService;
	
	public CricketCoach() {}
	
	//define a constructor for Dependency Injection
	@Autowired
	public CricketCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {           
		this.fortuneService = fortuneService;                      
	}                                                              

	public String getDailyWorkOut() {
		return "Practice catching for 1 hour";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune()+" Let Rock";
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
