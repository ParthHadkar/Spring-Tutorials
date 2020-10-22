package com.P1SpringIOC_XMLConfiguration;

import com.P1SpringIOC_XMLConfiguration.BaseballCoach.BaseballCoach;
import com.P1SpringIOC_XMLConfiguration.Coach.Coach;
import com.P1SpringIOC_XMLConfiguration.CricketCoach.CricketCoach;

public class MyApp {
	public static void main(String[] args) {
		// Create the object
		//Coach coach = new BaseballCoach();
		Coach coach = new CricketCoach();
		// Use the object
		System.out.println(coach.getDailyWorkout());
	}
}
