package com.P22Spring_LoggerXML;

import com.P22Spring_LoggerXML.Coach.BaseBallCoach;
import com.P22Spring_LoggerXML.Coach.Coach;
import com.P22Spring_LoggerXML.Coach.CricketCoach;
import com.P22Spring_LoggerXML.FortuneService.FortuneService;
import com.P22Spring_LoggerXML.FortuneService.HappyFortuneService;

public class MyApp {
	
	public static void main(String[] args) {
		
		//Create the Object 
		//FortuneService fortuneService = new HappyFortuneService();
		//Coach coach = new BaseBallCoach(fortuneService);
		Coach coach = new CricketCoach();
		// Use the Object
		System.out.println(coach.getDailyWorkOut());
		//let call fortune method of object
		//System.out.println(coach.getDailyFortune());
	}

}
