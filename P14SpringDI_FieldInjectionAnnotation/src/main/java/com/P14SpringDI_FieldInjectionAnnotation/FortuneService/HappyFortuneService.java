package com.P14SpringDI_FieldInjectionAnnotation.FortuneService;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getDailyFortune() {
		return "Today is your luck day";
	}

}
