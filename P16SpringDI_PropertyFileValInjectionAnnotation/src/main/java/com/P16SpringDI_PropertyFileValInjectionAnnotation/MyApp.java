package com.P16SpringDI_PropertyFileValInjectionAnnotation;

import com.P16SpringDI_PropertyFileValInjectionAnnotation.Coach.BaseBallCoach;
import com.P16SpringDI_PropertyFileValInjectionAnnotation.Coach.Coach;
import com.P16SpringDI_PropertyFileValInjectionAnnotation.Coach.CricketCoach;
import com.P16SpringDI_PropertyFileValInjectionAnnotation.FortuneService.FortuneService;
import com.P16SpringDI_PropertyFileValInjectionAnnotation.FortuneService.HappyFortuneService;

public class MyApp {

	public static void main(String[] args) {
		//Create the Object 
		FortuneService fortuneService = new HappyFortuneService();
		//BaseBallCoach coach = new BaseBallCoach(fortuneService);
		CricketCoach coach = new CricketCoach(fortuneService);
		coach.setEmailId("sd");
		coach.setTeam("sd");
		// Use the Object
		System.out.println(coach.getDailyWorkOut());
		//let call fortune method of object
		System.out.println(coach.getDailyFortune());
		// calling literal method of the bean 
		System.out.println(coach.getEmailId());
		System.out.println(coach.getTeam());
	}

}
