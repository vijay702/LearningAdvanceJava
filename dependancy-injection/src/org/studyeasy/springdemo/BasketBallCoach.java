package org.studyeasy.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach {
	
	
	  @Autowired
	  @Qualifier("sadFortuneService")
	private  FortuneService fortuneService;
	
	 
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "do highJump 30 minutes ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	
	
	

}
