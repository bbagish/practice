package com.automation.GetterAndSetters;

public class FamilyDinner {
	public static void main(String[] args) {

		Dinner Mom = new Dinner("Mom", "Seaweed Salad", "Dragon Roll Sushi");

		Dinner Dad = new Dinner("Dad", "Miso Soup", "Salmon Lovers");

		Dinner Child = new Dinner("Child", "Shrimp Tempura", "Noodles");

		System.out.println(Mom.getAppetizer());
		System.out.println(Dad.getMainEntry());
		System.out.println(Dad.getAppetizer());
		System.out.println("Cake pieces left: " + Dinner.getCakePiecesCount());

		Dad.takeAPieceOfCake();
		Child.takeAPieceOfCake();
		System.out.println("Cake pieces left: " + Dinner.getCakePiecesCount());
		Mom.takeAPieceOfCake();
		Mom.takeAPieceOfCake();
		System.out.println("Child cake pieces left: " + Child.getCakePiecesCount());
		Dinner.takeAPieceOfCake();
		Dinner.takeAPieceOfCake();
		System.out.println("Dad Cake pieces: " + Dad.getCakePiecesCount());
		Child.takeAPieceOfCake();
		Child.takeAPieceOfCake();
		Mom.takeAPieceOfCake();
		Dad.takeAPieceOfCake();
		System.out.println(Dinner.getCakePiecesCount());
		Dinner.takeAPieceOfCake();

	}
}
