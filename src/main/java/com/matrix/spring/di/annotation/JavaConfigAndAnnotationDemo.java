package com.matrix.spring.di.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigAndAnnotationDemo {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from container
		Coach coach = context.getBean("myTennisCoach",Coach.class);
		
		System.out.println("Constructor injectin using autowired");
				
		//call a method on bean
		System.out.println(coach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(coach.getDailyFortune());

		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	
		System.out.println("\n========================================\n");
		
		
		System.out.println("Setter injectin using autowired");
		
		//autowired using setter method
		Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		
		
		//close the container
		context.close();
		
	}

}
