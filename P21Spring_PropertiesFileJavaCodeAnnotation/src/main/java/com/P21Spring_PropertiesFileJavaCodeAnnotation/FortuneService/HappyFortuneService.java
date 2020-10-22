package com.P21Spring_PropertiesFileJavaCodeAnnotation.FortuneService;

import org.springframework.stereotype.Component;

import com.P21Spring_PropertiesFileJavaCodeAnnotation.FortuneService.FortuneService;

public class HappyFortuneService implements FortuneService{

	public String getDailyFortune() {
		return "Today is your luck day";
	}
}
