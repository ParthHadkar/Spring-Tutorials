package com.P10SpringIOC_AnnotationsConfig_DefaultComponentName.Coach;

import org.springframework.stereotype.Component;

@Component // default component annotation lowercase first letter of className
public class BaseBallCoach implements Coach {

	public String getDailyWorkOut() {
		return "Practice batting for 30 min";
	}

}
