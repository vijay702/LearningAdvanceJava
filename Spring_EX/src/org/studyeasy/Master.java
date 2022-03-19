package org.studyeasy;

import org.springframework.stereotype.Component;


public class Master implements Movies{

	@Override
	public String WatchMovie() {
		
		return "Watching master movie";
	}
	
	

}
