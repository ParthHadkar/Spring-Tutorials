package com.P17Spring_BeanScopesAnnotation.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.P17Spring_BeanScopesAnnotation.Coach.Coach;
import com.P17Spring_BeanScopesAnnotation.FortuneService.FortuneService;

@Component
@Scope("singleton")
public class BaseBallCoach implements Coach{
	
	//define a private feild for Dependency
	private FortuneService fortuneService;
	
	
	public BaseBallCoach() {
		System.out.println("BaseBallCoach: inside no-arg constructor");
	}

	@Autowired
	//define a constructor for Dependency Injection
	public BaseBallCoach(@Qualifier("happyFortuneService")FortuneService fortuneService) {
		System.out.println("BaseBallCoach: inside arg constructor ");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkOut() {
		return "Practice Batting For 30 min";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	

}
