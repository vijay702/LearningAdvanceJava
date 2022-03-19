package org.studyeasy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("org.studyeasy")
public class SpringConfig {
	
@Bean
public Movies master() {
	Master theMaster = new Master();
	return theMaster;
}
	
	
	
	
	}

