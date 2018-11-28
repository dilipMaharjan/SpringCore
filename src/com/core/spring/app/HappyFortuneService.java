package com.core.spring.app;

import org.springframework.stereotype.Component;

@Component("happyFortuneService")
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Enjoy your beautiful day";
	}

}
