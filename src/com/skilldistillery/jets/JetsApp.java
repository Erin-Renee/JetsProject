package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {
	Scanner kb = new Scanner(System.in);
	private static Airfield airfield = new Airfield();

	public static void main(String[] args) {
		JetsApp app = new JetsApp();
		app.run();
	}

	public void run() {
		menu();
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
		int choice = kb.nextInt();

		if (choice == 1) {
			list<Jets>();

		}

		if (choice == 2) {

		}
		if (choice == 3) {

		}
		if (choice == 4) {

		}
		if (choice == 5) {

		}
		if (choice == 6) {

		}
		if (choice == 7) {

		}
		if (choice == 8) {

		}
		if (choice == 9) {

		} else {
			System.out.println("please enter a number 1-9");
			run();
		}
	}

}
