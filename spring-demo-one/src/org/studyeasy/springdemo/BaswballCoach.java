package org.studyeasy.springdemo;

public class BaswballCoach implements Coach {
	
	
	//define a private filed for the company
	private FortuneService fortuneservice;
	
	//define a constructor for dependency injecion
	public BaswballCoach(FortuneService theFortuneService) {
		fortuneservice = theFortuneService;
	}
	
	
	
	
	
	public String getDailyWorkout() {
		return "spend 30 minutes on batting practice" ;
	}







	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}
