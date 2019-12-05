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
		
	}//constructor

	public void ParseFile() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("Jets.txt"));
			String line = ""; 
			while ((line = br.readLine()) != null) {
				String[] fields = line.split(", ");
				if (fields[0].equals("fighter")) {
//					String model, double speed, int range, long price
					jets.add(new FighterJet(fields[0],fields[1], Double.parseDouble(fields[2]), Integer.parseInt(fields[3]),
					Long.parseLong(fields[4])));
				}
				if (fields[0].equals("cargo")) {
//					String model, double speed, int range, long price
					jets.add(new CargoPlane(fields[0],fields[1], Double.parseDouble(fields[2]), Integer.parseInt(fields[3]),
					Long.parseLong(fields[4])));
				}
				if (fields[0].equals("otherplane")) {
//					String model, double speed, int range, long price
					jets.add(new JetImpl(fields[0],fields[1], Double.parseDouble(fields[2]), Integer.parseInt(fields[3]),
					Long.parseLong(fields[4])));
				}
				
			}//while loop
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(jets);
		//return jets;
	}//public  List<Jet> ParseFile()
	
}//class airfield


