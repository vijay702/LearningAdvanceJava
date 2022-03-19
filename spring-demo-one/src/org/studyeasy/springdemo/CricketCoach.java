package org.studyeasy.springdemo;


public class CricketCoach implements Coach {
	
private FortuneService fortuneservice;
//add new fileds 

private String emailAddress;
private String team;


//create a no arg constructor

public String getEmailAddress() {
	return emailAddress;
}


public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}


public String getTeam() {
	return team;
}


public void setTeam(String team) {
	this.team = team;
}


	//our setter method 
	public void setFortuneservice(FortuneService fortuneservice) {
	this.fortuneservice = fortuneservice;
}


	@Override
	public String getDailyWorkout() {
		
		return "practise fast bowling 15 mins a day";
	}

	

	@Override
	public String getFortune() {
		
		return fortuneservice.getFortune();
	}

}
