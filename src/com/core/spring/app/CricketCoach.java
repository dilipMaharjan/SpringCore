package com.core.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cricket")
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
//properties file injection
	@Value("${team}")
	private String team;

	@Value("${email}")
	private String emailAddress;

	@Override
	public String getDailyWorkOut() {
		return "5 rounds early morning";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

//setter injection
	@Autowired
	@Qualifier("sadFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
