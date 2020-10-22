package com.P17Spring_BeanScopesAnnotation.FortuneService;

import org.springframework.stereotype.Component;

import com.P17Spring_BeanScopesAnnotation.FortuneService.FortuneService;

@Component
public class HappyFortuneService implements FortuneService{

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is your luck day";
	}
}
