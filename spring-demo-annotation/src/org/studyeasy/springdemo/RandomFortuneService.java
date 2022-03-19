package org.studyeasy.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;


@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array od strings
	
	private String[] data= {"today is today","yesterday was yesterday","tommorow tommorwo"};
	
	//create a random number genrator
	private Random myrandom = new Random();

	@Override
	public String getFortune() {
		int index =myrandom.nextInt(data.length);
		String theFortune= data[index];
		
		return theFortune;
	}

}
