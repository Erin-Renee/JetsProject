package com.skilldistillery.jets;

import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Airfield {
	private List<Jet> jetsArr;		//listarray

	public Airfield() {
		jetsArr = new ArrayList<>();
		parseFile();		//call parseFile() method
	}// constructor

	public void parseFile() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("Jets.txt"));
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] fieldsListArr = line.split(", ");
				if (fieldsListArr[0].equals("fighter")) {
//					String model, double speed, int range, long price
					jetsArr.add(new FighterJet(fieldsListArr[0], fieldsListArr[1], Double.parseDouble(fieldsListArr[2]),
							Integer.parseInt(fieldsListArr[3]), Long.parseLong(fieldsListArr[4])));
				}
				if (fieldsListArr[0].equals("cargo")) {
//					String model, double speed, int range, long price
					jetsArr.add(new CargoPlane(fieldsListArr[0], fieldsListArr[1], Double.parseDouble(fieldsListArr[2]),
							Integer.parseInt(fieldsListArr[3]), Long.parseLong(fieldsListArr[4])));
				}
				if (fieldsListArr[0].equals("otherplane")) {
//					String model, double speed, int range, long price
					jetsArr.add(new JetImpl(fieldsListArr[0], fieldsListArr[1], Double.parseDouble(fieldsListArr[2]),
							Integer.parseInt(fieldsListArr[3]), Long.parseLong(fieldsListArr[4])));
				}

			} // while loop
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// System.out.println(jetsArr);
		// return jets;
	}// public List<Jet> ParseFile()

	public void listJets() {
		for (Jet jet : jetsArr) { // type object : arrayofobjects
			System.out.println(jet); // calls the object toString
		}
	}

	public void fly() {
		for (Jet jet : jetsArr) {		// type object : arrayofobjects
			jet.fly();		//call fly method from Jet
		}
	}

	public void fastestJet() {
		Jet fastestJet = null;
		Double fast = Double.MIN_VALUE;
		for (Jet jet : jetsArr) {
			if (jet.getSpeed() > fast) {
				fast = jet.getSpeed();
				fastestJet = jet;
			} // if statement
		} // for loop
		System.out.println("Fastest Jet = " + fastestJet);

	}// fastestJet method

	public void longestRange() {
		Jet longestRange = null;
		Integer range = Integer.MIN_VALUE;
		for (Jet jet : jetsArr) {
			if (jet.getRange() > range) {
				range = jet.getRange();
				longestRange = jet;
			} // if statement
		} // for loop
		System.out.println("Longest Range " + longestRange);
	}

	public void loadCargo() {
		for (Jet jet : jetsArr) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
			}
		}

	}

	public void dogFight() {
		for (Jet jet : jetsArr) {
			if (jet instanceof CombatReady) {
				((CombatReady) jet).fight();
			}
		}
	}

	public void addJet(Scanner kb) {
		System.out.println("Please enter jet type: ");
		System.out.println("1. fighter, 2. cargo, 3. other plane(enter 1-3): ");
		int choicetype = kb.nextInt();
		System.out.println("Please enter your jet model: ");
		String choicemodel = kb.next();
		System.out.println("Please enter jet speed: ");
		double choicespeed = kb.nextDouble();
		System.out.println("Please enter jet range: ");
		int choicerange = kb.nextInt();
		System.out.println("Please enter jet price: ");
		long choiceprice = kb.nextLong();

		switch (choicetype) {
		case 1:
			jetsArr.add(new FighterJet("fighter", choicemodel, choicespeed, choicerange, choiceprice));
			break;
		case 2:
			jetsArr.add(new CargoPlane("cargo", choicemodel, choicespeed, choicerange, choiceprice));
			break;
		case 3:
			jetsArr.add(new JetImpl("other plane", choicemodel, choicespeed, choicerange, choiceprice));
			break;
		default:
			System.out.println("error in making new plane");
			break;

		}// switch

	}// method addJet

	public void removeJet(Scanner kb) {
		System.out.println("Please select plane for disposal");
		for (int i = 0; i < jetsArr.size(); i++) {
			System.out.println((i + 1) + ". " + jetsArr.get(i));

		} // for loop

		int num = kb.nextInt();
		jetsArr.remove(num - 1);
		System.out.println("Plane has been destroyed.");
	}

}// class airfield
