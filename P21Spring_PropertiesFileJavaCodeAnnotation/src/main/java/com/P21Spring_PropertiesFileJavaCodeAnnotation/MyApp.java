package com.P21Spring_PropertiesFileJavaCodeAnnotation;

import com.P21Spring_PropertiesFileJavaCodeAnnotation.Coach.BaseBallCoach;
import com.P21Spring_PropertiesFileJavaCodeAnnotation.Coach.Coach;
import com.P21Spring_PropertiesFileJavaCodeAnnotation.Coach.CricketCoach;
import com.P21Spring_PropertiesFileJavaCodeAnnotation.FortuneService.FortuneService;
import com.P21Spring_PropertiesFileJavaCodeAnnotation.FortuneService.HappyFortuneService;

public class MyApp {
	
	public static void main(String[] args) {
		
		//Create the Object 
		//FortuneService fortuneService = new HappyFortuneService();
		//BaseBallCoach coach = new BaseBallCoach(fortuneService);
		CricketCoach coach = new CricketCoach();
		// Use the Object
		System.out.println(coach.getDailyWorkOut());
		//let call fortune method of object
		System.out.println(coach.getDailyWorkOut());
		//let call fortune method of object
		System.out.println(coach.getDailyFortune());
		// calling literal method of the bean 
		System.out.println(coach.getEmailId());
		System.out.println(coach.getTeam());
	}

}
