package com.core.spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.core.spring.app")
public class BeanConfigInAppConfig {

	@Bean
	public HappyFortuneService happyFortuneService() {
		return new HappyFortuneService();
	}

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(happyFortuneService());
	}
}
