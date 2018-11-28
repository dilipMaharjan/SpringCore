package com.core.spring.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("track") // identifies as bean
@Scope("singleton") // declares scope of a bean
public class TrackCoach implements Coach {

	// field injection
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

//	@Autowired
//	public TrackCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkOut() {
		return "Daily run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	@PostConstruct
	public void init() {
		System.out.println("During initialization");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("before destruction");
	}
}
