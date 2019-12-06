package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
		
	}

@Override
public void loadCargo() {
	System.out.println(this.getModel() + " is receiving cargo");
}
@Override
public void fly() {
	System.out.println(this.getModel() + " currently flying and has a range of " + this.getRange() + " at a speed of " + this.getSpeed());
}
}
