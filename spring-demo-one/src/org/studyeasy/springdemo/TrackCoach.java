package org.studyeasy.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService  fortuneservice;
	
	
	public TrackCoach(FortuneService thefortuneService) {
		fortuneservice = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "run hard 5k";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}