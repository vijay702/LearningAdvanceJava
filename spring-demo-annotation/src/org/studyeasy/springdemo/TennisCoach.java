package org.studyeasy.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService ;
	//define adefault constructor
	
	public TennisCoach() {
		System.out.println(">> TennisCoach:inside default constructor");
		
		
	
	}
	
	//define init method 
	
	
	
	//define my destroy method 
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach:inside setfortune method() constructor");
//		this.fortuneService = fortuneService;
//	}
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}*/


	@Override
	public String getDailyWorkOut() {
		
		return "practice your backend volley";
	}

	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	
}
