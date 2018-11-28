package com.core.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//default bean id is baseBallCoach
@Component
public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;

//constructor injection
	@Autowired

	public BaseBallCoach(@Qualifier("sadFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Daily 30 minutes work out";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
