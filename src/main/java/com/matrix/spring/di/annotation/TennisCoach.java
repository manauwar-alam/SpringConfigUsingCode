package com.matrix.spring.di.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {

	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {

		return "How many Goals Today";
		
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void initMe()
	{
		System.out.println("Initilizing Tennis Coach");
	}
	
	@PreDestroy
	public void destroyMe() {
		
		System.out.println("Destroying Tennis Coach");
	}

}
