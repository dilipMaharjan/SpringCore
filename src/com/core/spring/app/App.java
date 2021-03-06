package com.core.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach bcoach = context.getBean("baseball", Coach.class);
		System.out.println(bcoach.getDailyWorkOut());
		System.out.println(bcoach.getDailyFortune());

		Coach tcoach = context.getBean("track", Coach.class);
		System.out.println(tcoach.getDailyWorkOut());
		System.out.println(bcoach.getDailyFortune());

		CricketCoach ccoach = context.getBean("cricket", CricketCoach.class);
		System.out.println(ccoach.getDailyWorkOut());
		System.out.println(ccoach.getDailyFortune());
		System.out.println(ccoach.getTeam());
		System.out.println(ccoach.getEmailAddress());

		context.close();
	}
}
