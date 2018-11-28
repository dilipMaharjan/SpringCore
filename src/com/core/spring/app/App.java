package com.core.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("coach", Coach.class);
		System.out.println(coach.getDailyWorkOut());
		context.close();
	}
}
