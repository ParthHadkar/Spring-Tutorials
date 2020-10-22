package com.P20SpringBean_JavaCodeAnnotation.FortuneService;

import org.springframework.stereotype.Component;

import com.P20SpringBean_JavaCodeAnnotation.FortuneService.FortuneService;

public class HappyFortuneService implements FortuneService{

	public String getDailyFortune() {
		return "Today is your luck day";
	}
}
