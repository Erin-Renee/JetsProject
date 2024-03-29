package com.skilldistillery.jets;

public abstract class Jet {

	private String type;
	private String model;
	private double speed;
	private int range;
	private long price;

	public Jet() {

	}

	public Jet(String type, String model, double speed, int range, long price) {
		super();
		this.type = type;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

	public void fly() {
		double flighttimex = (this.getRange()) / (this.getSpeed());
		System.out.println(this.getModel() + ", is currently flying and has a range of " + this.getRange()
				+ " at a speed of " + this.getSpeed() + " making the average flight time " + flighttimex);
	}

}
