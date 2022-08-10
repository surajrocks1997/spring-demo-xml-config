package com.demo.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortunes() {
		return "Just Do It" + fortuneService.getFortune();
	}

	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside method doMyStartUpStuff");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
