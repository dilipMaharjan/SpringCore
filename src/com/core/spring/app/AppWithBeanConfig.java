package com.core.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppWithBeanConfig {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				BeanConfigInAppConfig.class);

		Coach scoach = context.getBean("swimCoach", Coach.class);
		System.out.println(scoach.getDailyWorkOut());
		System.out.println(scoach.getDailyFortune());

		context.close();

	}
}
