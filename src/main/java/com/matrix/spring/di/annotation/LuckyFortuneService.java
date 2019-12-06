package com.matrix.spring.di.annotation;

import org.springframework.stereotype.Component;


@Component
public class LuckyFortuneService implements FortuneService {

	public String getFortune() {
		
		return "Today is your Lucky Day";
	}

}
