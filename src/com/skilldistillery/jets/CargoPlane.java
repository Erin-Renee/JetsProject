package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
		
	}

@Override
public void loadCargo() {
}
}
