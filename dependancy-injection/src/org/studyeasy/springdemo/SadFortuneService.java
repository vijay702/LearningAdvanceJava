package org.studyeasy.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "youre going to loose ";
	}
	
	

}
