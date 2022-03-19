package org.studyeasy.springdemo;



public class Trackcoach implements Coach {

   
	private  FortuneService fortuneService;
	
	 
	public Trackcoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyworkout() {
	
		return "run 30 hkm";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

	

	
}
