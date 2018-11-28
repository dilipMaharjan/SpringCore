package com.core.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppWithAnnotation {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext-annotation.xml");
		Coach bcoach = context.getBean("baseBallCoach", Coach.class);
		System.out.println(bcoach.getDailyWorkOut());
		System.out.println(bcoach.getDailyFortune());

		Coach tcoach = context.getBean("track", Coach.class);
		System.out.println(tcoach.getDailyWorkOut());
		System.out.println(tcoach.getDailyFortune());

		CricketCoach ccoach = context.getBean("cricket", CricketCoach.class);
		System.out.println(ccoach.getDailyWorkOut());
		System.out.println(ccoach.getDailyFortune());
		System.out.println(ccoach.getTeam());
		System.out.println(ccoach.getEmailAddress());

		context.close();

	}

}
