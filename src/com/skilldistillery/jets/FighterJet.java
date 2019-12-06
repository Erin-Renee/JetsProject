package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {
	
	public FighterJet() {
		super();
	}

	public FighterJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
		
	}
	

	@Override
	public void fight() {
		System.out.println(this.getModel() + " Preparing for DogFight");
		System.out.println("Systems Engaged");
		System.out.println("Pew! Pew! Pew!");
		
	}

	@Override
	public void fly() {
		System.out.println(this.getModel() + " currently flying and has a range of " + this.getRange());
	}

	
}
