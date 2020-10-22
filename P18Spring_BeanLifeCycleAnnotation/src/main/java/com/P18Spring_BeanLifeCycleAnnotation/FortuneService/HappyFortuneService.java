package com.P18Spring_BeanLifeCycleAnnotation.FortuneService;

import org.springframework.stereotype.Component;

import com.P18Spring_BeanLifeCycleAnnotation.FortuneService.FortuneService;

@Component
public class HappyFortuneService implements FortuneService{

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is your luck day";
	}
}
