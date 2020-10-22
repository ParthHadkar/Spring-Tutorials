package com.P20SpringBean_JavaCodeAnnotation.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.P20SpringBean_JavaCodeAnnotation.Coach.BaseBallCoach;
import com.P20SpringBean_JavaCodeAnnotation.Coach.Coach;
import com.P20SpringBean_JavaCodeAnnotation.Coach.CricketCoach;
import com.P20SpringBean_JavaCodeAnnotation.FortuneService.FortuneService;
import com.P20SpringBean_JavaCodeAnnotation.FortuneService.HappyFortuneService;
import com.P20SpringBean_JavaCodeAnnotation.FortuneService.RandomFortuneService;

@Configuration
//@ComponentScan("com.P20SpringBean_JavaCodeAnnotation")
public class SpringConfig {

	// define bean for happyFortuneService
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	// define bean for randomFortuneService
		@Bean
		public FortuneService randomFortuneService() {
			return new RandomFortuneService();
		}
	
	// define bean for cricketCoach and inject dependencies
	@Bean
	public Coach cricketCoach() {
		return new CricketCoach(randomFortuneService());
	}
	
	// define bean for baseBall and inject dependencies
		@Bean
		public Coach baseBallCoach() {
			return new BaseBallCoach(happyFortuneService());
		}
}
