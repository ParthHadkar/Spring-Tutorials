package com.P17Spring_BeanScopesAnnotation.FortuneService;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an arrays of fortunes
	private String[] randomFortunes = {"today is your lucky day","Someting good is waiting for you"
			,"today will be best day of your life"};
	
	//create a random number generator
	private Random random = new Random();
	
	public String getDailyFortune() {
		int ranIndex = random.nextInt(randomFortunes.length);
		String randomFortune = randomFortunes[ranIndex];
		return randomFortune;
	}

}
