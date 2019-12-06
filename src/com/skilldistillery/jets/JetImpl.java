package com.skilldistillery.jets;

public class JetImpl extends Jet {
	public JetImpl(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);

	}

	@Override
	public void fly() {
		double flighttime = (this.getRange()) / (this.getSpeed());
		System.out.println(
				"This plane, " + this.getModel() + ", is currently flying and has a range of " + this.getRange()
						+ " at a speed of " + this.getSpeed() + " making the average flight time " + flighttime);
	}
}
