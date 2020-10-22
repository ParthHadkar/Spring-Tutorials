package com.P8Spring_BeanLifeCycle;

import com.P8Spring_BeanLifeCycle.Coach.BaseBallCoach;
import com.P8Spring_BeanLifeCycle.Coach.Coach;
import com.P8Spring_BeanLifeCycle.Coach.CricketCoach;
import com.P8Spring_BeanLifeCycle.FortuneService.FortuneService;
import com.P8Spring_BeanLifeCycle.FortuneService.HappyFortuneService;

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
