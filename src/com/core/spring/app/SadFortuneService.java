package com.core.spring.app;

import org.springframework.stereotype.Component;

@Component("sadFortuneService")
public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Long day";
	}

}
