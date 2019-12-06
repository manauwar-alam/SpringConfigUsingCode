package com.matrix.spring.di.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myCricketCoach")
@Scope("prototype")
public class CricketCoach  implements Coach{
	
	
	private FortuneService fortuneService;
	
	public CricketCoach()
	{
//		System.out.println(">> Inside Cricket coach constructor");
	}

	public String getDailyWorkout() {
		
		return "How many runs";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	@Autowired
	@Qualifier("luckyFortuneService")
	public void setDailyFortuneService(FortuneService fortuneService)
	{
//		System.out.println(">> Inside setDailyFortuneService method");
		this.fortuneService = fortuneService;
	}
	
	@PostConstruct
	public void initMe()
	{
		System.out.println("Initilizing Cricket Coach");
	}
	
	@PreDestroy
	public void destroyMe() {
		
		System.out.println("Destroying Cricket Coach");
	}

	
}
