package com.P19SpringConfig_JavaCodeAnnotation.FortuneService;

import org.springframework.stereotype.Component;

import com.P19SpringConfig_JavaCodeAnnotation.FortuneService.FortuneService;

@Component
public class HappyFortuneService implements FortuneService{

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is your luck day";
	}
}
