package com.P23Spring_LoggerAnnotation.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.P23Spring_LoggerAnnotation.Coach.BaseBallCoach;
import com.P23Spring_LoggerAnnotation.Coach.Coach;
import com.P23Spring_LoggerAnnotation.Coach.CricketCoach;
import com.P23Spring_LoggerAnnotation.FortuneService.FortuneService;
import com.P23Spring_LoggerAnnotation.FortuneService.HappyFortuneService;
import com.P23Spring_LoggerAnnotation.FortuneService.RandomFortuneService;

@Configuration
@PropertySources({@PropertySource("classpath:logger.properties"),@PropertySource("classpath:sport.properties")})
//@ComponentScan("com.P21Spring_PropertiesFileJavaCodeAnnotation")
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
	
		/*   // add support to resolve ${...} properties spring 4.2 and lower
	    @Bean
	    public static PropertySourcesPlaceholderConfigurer
	                    propertySourcesPlaceHolderConfigurer() {
	        
	        return new PropertySourcesPlaceholderConfigurer();
	    }*/
	    
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
