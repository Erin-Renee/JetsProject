package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApp {
	// fields
	Scanner kb = new Scanner(System.in);
	private Airfield airfield = new Airfield();
	// ArrayList<Jet> jets = new ArrayList<>();

	public static void main(String[] args) {
		JetsApp app = new JetsApp();
		// ((FighterJet) app.jets.get(0)).fight();
		app.run();
	}

	public void run() {
		try {
			System.out.println("Welcome to the Airfield!");
			int choice;

			boolean menureturn = true;
			while (menureturn) {
				menu();
				choice = kb.nextInt();

				switch (choice) {
				case 1:
					airfield.listJets(); // calls class Airfield and tells it to run method listJets()
					break;
				case 2:
					airfield.fly();
					break;
				case 3:
					airfield.fastestJet();
					break;
				case 4:
					airfield.longestRange();
					break;
				case 5:
					airfield.loadCargo();
					break;
				case 6:
					airfield.dogFight();
					break;
				case 7:
					airfield.addJet(kb);
					break;
				case 8:
					airfield.removeJet(kb);
					break;
				case 9:
					Quit();
					menureturn = false;
					break;
				default:
					System.out.println("please enter a numner (1-9)");
					break;

				}// switch
			} // while
		} // try
		catch (Exception e) {
			System.out.println("ERROR RESTART PROGRAM");

		}

	}// run method

	public void menu() {
		System.out.println("----------------------------------------");
		System.out.println("1: List Jets");
		System.out.println("2: Fly All Jets");
		System.out.println("3: View fastest jet");
		System.out.println("4: View jet with longest range");
		System.out.println("5: Load all Cargo Jets");
		System.out.println("6: Dogfight!");
		System.out.println("7: Add a jet to Fleet");
		System.out.println("8: Remove a jet from Fleet");
		System.out.println("9: Quit");
		System.out.println("----------------------------------------");

	}

	public void Quit() {
		System.out.println("goodbye");
	}

}
