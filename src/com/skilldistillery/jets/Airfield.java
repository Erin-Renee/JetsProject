package com.skilldistillery.jets;

import java.util.List;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Airfield {
	public List<Jet> jets;

	public Airfield() {
		jets = new ArrayList<>();
		
	}

	public  List<Jet> ParseFile() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("Jets.txt"));
			String line = ""; 
			while ((line = br.readLine()) != null) {
				String[] fields = line.split(", ");		// goes to Jets.txt and breaks after a ", "
				Jet newplane = null;
				if (fields[0].equals("fighter")) {
//					String model, double speed, int range, long price
					newplane = new FighterJet(fields[0], fields[1], Double.parseDouble(fields[2]), Integer.parseInt(fields[3]),
					Long.parseLong(fields[4]));		//5 fields for the 5 objects in Jets.txt separated by spaces
					jets.add(newplane);
				}
				if (fields[0].equals("cargo")) {
					newplane = new CargoPlane(fields[0], fields[1], Double.parseDouble(fields[2]), Integer.parseInt(fields[3]),
							Long.parseLong(fields[4]));
					jets.add(newplane);
				}
				if (fields[0].equals("otherplane")) {
					newplane = new JetImpl(fields[0], fields[1], Double.parseDouble(fields[2]), Integer.parseInt(fields[3]),
							Long.parseLong(fields[4]));
					jets.add(newplane);		//add the newplane(with its fields) to the array jets
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


