package com.skilldistillery.jets;

public abstract class Jet {

	protected String model;
	protected double speed;
	protected int range;
	protected long price;
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
		
	}
	
	public double getSpeedInMach() {
		return speed;
	}
}
