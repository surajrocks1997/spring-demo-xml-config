package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("myGolfCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortunes());
		
		context.close();
	}
}
