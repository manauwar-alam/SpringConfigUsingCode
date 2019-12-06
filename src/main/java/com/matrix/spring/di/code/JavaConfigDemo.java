package com.matrix.spring.di.code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemo {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from container
		Coach coach = context.getBean("swimCoach",Coach.class);
		
				
		//call a method on bean
		System.out.println(coach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(coach.getDailyFortune());
		
		
		
		
		//getting values from properties
		SwimCoach swimCoach = context.getBean("swimCoach",SwimCoach.class);
		System.out.println("email from properties : "+swimCoach.getEmail());
		System.out.println("team from properties : "+swimCoach.getTeam());
		
		
		//close the container
				context.close();

		
	}

}
