package com.matrix.spring.di.code;


public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is a sad day";
	}

}
