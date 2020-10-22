package com.P13SpringDI_MethodInjectionAnnotation.FortuneService;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getDailyFortune() {
		return "Today is your luck day";
	}

}
