package com.skilldistillery.jets;

import java.util.List;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Airfield {
	private List<Jet> jets;

	public Airfield() {
		jets = new ArrayList<>();

	}

	public  List<Jet> ParseFile() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("Jets.txt"));
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] fields = line.split(", ");
				Jet newplane = null;
				if (fields[0].contentEquals("fighter")) {
//					String model, double speed, int range, long price
					newplane = new FighterJet(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[3]),
					Long.parseLong(fields[4]));
					jets.add(newplane);
				}
				if (fields[0].contentEquals("cargo")) {
					newplane = new CargoPlane(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[3]),
					Long.parseLong(fields[4]));
					jets.add(newplane);
				}
				if (fields[0].contentEquals("plainjet")) {
					newplane = new JetImpl(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[3]),
					Long.parseLong(fields[4]));
					jets.add(newplane);
				}
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jets;
	}

}

/*
 * public List<Jet> ParseFile() { try { BufferedReader br = new
 * BufferedReader(new FileReader("Jets.txt")); String line = ""; while ((line =
 * br.readLine()) != null) { String[] fields = line.split(", "); Jet newplane =
 * null; if (fields[0].contentEquals("fighter")) { String model = fields[1];
 * double speed = Double.parseDouble(fields[2]); int range =
 * Integer.parseInt(fields[3]); long price = Long.parseLong(fields[4]); newplane
 * = new FighterJet(model, speed, range, price); jets.add(newplane); }
 */
