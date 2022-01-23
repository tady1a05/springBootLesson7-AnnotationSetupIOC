package com.test.springboot;

import org.springframework.stereotype.Component;

@Component
public class swimCoach implements Coach{
	private FortunateServices fs;
	
	@Override
	public String doWorkout() {
		// TODO Auto-generated method stub
		return "swim 100m";
	}

	@Override
	public String doFortunate() {
		// TODO Auto-generated method stub
		return fs.doFortunate();
	}
	
}
