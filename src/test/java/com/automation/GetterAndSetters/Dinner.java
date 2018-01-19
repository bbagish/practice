package com.automation.GetterAndSetters;

public class Dinner {
	private String person;

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getAppetizer() {
		return appetizer;
	}

	public void setAppetizer(String appetizer) {
		this.appetizer = appetizer;
	}

	public String getMainEntry() {
		return mainEntry;
	}

	public void setMainEntry(String mainEntry) {
		this.mainEntry = mainEntry;
	}

	private String appetizer;
	private String mainEntry;
	// private String person, appetizer, mainEntry; either way is fine
	public static int cakePieces = 10;
	// static{ either way is fine
	// cakePieces=10;

	public Dinner(String person, String appetizer, String mainEntry) {
		this.person = person;
		this.appetizer = appetizer;
		this.mainEntry = mainEntry;
	}

	public static void takeAPieceOfCake() {
		if (cakePieces <= 0) {
			System.out.println("No More Cake!");
		} else {
			cakePieces--;
		}
	}

	public static int getCakePiecesCount() {
		return cakePieces;
	}
}
