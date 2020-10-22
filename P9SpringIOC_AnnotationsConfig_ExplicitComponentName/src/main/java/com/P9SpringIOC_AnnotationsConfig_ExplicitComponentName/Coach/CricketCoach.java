package com.P9SpringIOC_AnnotationsConfig_ExplicitComponentName.Coach;

import org.springframework.stereotype.Component;

@Component("CricketCoachs")
public class CricketCoach implements Coach {

	public String getDailyWorkOut() {
		return "Practice catching for 1 hour";
	}

}
