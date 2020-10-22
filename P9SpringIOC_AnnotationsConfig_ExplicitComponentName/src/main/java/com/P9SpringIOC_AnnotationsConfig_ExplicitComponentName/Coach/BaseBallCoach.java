package com.P9SpringIOC_AnnotationsConfig_ExplicitComponentName.Coach;

import org.springframework.stereotype.Component;

@Component("BaseBallCoachs")
public class BaseBallCoach implements Coach {

	public String getDailyWorkOut() {
		return "Practice batting for 30 min";
	}

}
