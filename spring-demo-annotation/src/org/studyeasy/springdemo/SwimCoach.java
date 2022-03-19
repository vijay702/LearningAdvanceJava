package org.studyeasy.springdemo;



public class SwimCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	
	
	
	public SwimCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkOut() {
		return "Swim 1000 Meters As A Warm Up ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune();
	}

	

}
