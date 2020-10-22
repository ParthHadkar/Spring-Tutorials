package com.P17Spring_BeanScopesAnnotation.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.P17Spring_BeanScopesAnnotation.Coach.Coach;
import com.P17Spring_BeanScopesAnnotation.FortuneService.FortuneService;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {
	
	//define a private field for Dependency
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	@Autowired
	//define a constructor for Dependency Injection
	public CricketCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) { 
		System.out.println("CricketCoach: inside arg constructor ");
		this.fortuneService = fortuneService;                      
	}                                                              

	public String getDailyWorkOut() {
		return "Practice catching for 1 hour";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune()+" Let Rock";
	}

}
