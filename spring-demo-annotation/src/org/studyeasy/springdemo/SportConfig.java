package org.studyeasy.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.studyeasy.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define a method to expose a bean 
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	
	//define bean for our swim coach and inject dependicy
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
