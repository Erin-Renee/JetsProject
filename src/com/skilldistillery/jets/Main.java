package com.skilldistillery.jets;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		JetsApp app = new JetsApp();
		app.airfield.ParseFile();
		app.jets = (ArrayList<Jet>) app.airfield.jets;
		((FighterJet) app.jets.get(0)).fight();
		app.run();

		// app.run();

	}// main

}
