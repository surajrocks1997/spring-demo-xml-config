package com.demo.springdemo;

public class GolfCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public GolfCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Daily practice putting skills for atleast 2 hours";
	}

	@Override
	public String getDailyFortunes() {
		return fortuneService.getFortune();
	}

}
