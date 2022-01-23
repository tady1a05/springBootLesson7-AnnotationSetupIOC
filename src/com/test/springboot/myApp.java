package com.test.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Coach coach = context.getBean("swimCoach",Coach.class);
		
		System.out.println(coach.doWorkout());
		
		context.close();
	}

}
