package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApp {
	Scanner kb = new Scanner(System.in);
	Airfield airfield = new Airfield();
	ArrayList<Jet> jets = new ArrayList<>();

	public void run() {
		System.out.println("Welcome to the Airfield!");
		int choice;
		boolean menureturn = true;
		while (menureturn) {
			menu();
			choice = kb.nextInt();

			switch (choice) {
			case 1:
				listJets(jets);
				break;
			case 2:
				Fly(jets);
				break;
			case 3:
				fastestJet(jets);
				break;
			case 5:
				longestRange(jets);
				break;
			case 6:
				Fight(jets);
				break;
			case 7:
				addJet(jets);
				break;
			case 8:
				removeJet(jets);
				break;
			case 9:
				Quit();
				menureturn = false;
				break;
			}
		}
	}

	public void menu() {
		System.out.println("1: List Jets");
		System.out.println("2: Fly All Jets");
		System.out.println("3: View fastest jet");
		System.out.println("4: View jet with longest range");
		System.out.println("5: Load all Cargo Jets");
		System.out.println("6: Dogfight!");
		System.out.println("7: Add a jet to Fleet");
		System.out.println("8: Remove a jet from Fleet");
		System.out.println("9: Quit");

	}

	public void listJets(List<Jet> jets) {
		for (Jet jet : jets) {
			System.out.println(jet);
		}
	}

	public void Fly(List<Jet> jets) {
		for (Jet jet : jets) {
			jet.fly();
		}
	}

	public void fastestJet(List<Jet> jets) {
		Jet fastestJet = null;
		Double fast = Double.MIN_VALUE;
		for (Jet jet : jets) {
			if (jet.getSpeed() > fast) {
				fast = jet.getSpeed();
				fastestJet = jet;
			}
		}
		System.out.println("Fastest Jet = " + fastestJet.toString());

	}

	public void longestRange(List<Jet> jets) {
		Jet longestRange = null;
		Integer range = Integer.MIN_VALUE;
		for (Jet jet : jets) {
			if (jet.getRange() > range) {
				range = jet.getRange();
				longestRange = jet;
			}
			System.out.println("Longest Range " + longestRange.toString());
		}
	}

	public void loadCargo(List<Jet> jets) {
		for (Jet jet : jets) {
			System.out.println(jet);
		}

	}

	public void Fight(List<Jet> jets) {
		for (Jet jet : jets) {
			System.out.println(jet);
		}
	}

	public void addJet(List<Jet> jets) {
		for (Jet jet : jets) {
			System.out.println(jet);
		}

	}

	public void removeJet(List<Jet> jets) {
		for (Jet jet : jets) {
			System.out.println(jet);
		}

	}

	public void Quit() {
		System.out.println("goodbye");
	}

}		 
	