package org.studyeasy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("org.studyeasy.spring")

public class Appconfig {
	
	
	
	@Bean
	public Service softwareService() {
		return new SoftwareService();
	}

}
