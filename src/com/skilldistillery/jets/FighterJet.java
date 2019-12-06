package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {
	
	public FighterJet() {
		super();
	}

	public FighterJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
		
	}
	

	@Override		////override ensures this fly() method is called over others in different classes or parent classes
	public void fight() {
		System.out.println(this.getModel() + " Preparing for DogFight");
		System.out.println("Systems Engaged");
		System.out.println("Pew! Pew! Pew!");
		System.out.println("mayday mayday");
		System.out.println("enemy target destroyed!!!!");
	}

	@Override
	public void fly() {
		double flighttimef =  (this.getRange()) / (this.getSpeed());
		System.out.println(
				"This fighter jet, " + this.getModel() + ", is currently flying and has a range of " + this.getRange()
						+ " at a speed of " + this.getSpeed() + " making the average flight time " + flighttimef);
	}

	
}
