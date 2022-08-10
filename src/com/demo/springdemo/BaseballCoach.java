package com.demo.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach() {}
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on Batting practice";
	}

	@Override
	public String getDailyFortunes() {
		return fortuneService.getFortune();
	}
}
