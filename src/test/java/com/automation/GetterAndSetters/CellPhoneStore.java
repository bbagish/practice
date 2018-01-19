package com.automation.GetterAndSetters;


public class CellPhoneStore {
 public static void main(String[] args) {
	 SmartPhone cellPhone1=new SmartPhone();
		
	 	cellPhone1.brand="Apple";
		cellPhone1.memory=16;
		cellPhone1.price=599;
		cellPhone1.call();
		
		System.out.println("model is: "+cellPhone1.brand);
		System.out.println("memory size: "+cellPhone1.memory);
		System.out.println("Price $ "+cellPhone1.price);
		
		SmartPhone cellPhone2=new SmartPhone();
		
	 	cellPhone2.brand="Apple 7";
		cellPhone2.memory=32;
		cellPhone2.price=799;
		
		System.out.println("model is: "+cellPhone2.brand);
		System.out.println("memory size: "+cellPhone2.memory);
		System.out.println("Price $ "+cellPhone2.price);
		SmartPhone smartPhone=new SmartPhone();
		smartPhone.takeAPhoto();
		smartPhone.price=699;
		smartPhone.buy();
		SmartPhone smartPhone1=new SmartPhone();
		smartPhone1.takeAPhoto();
		smartPhone1.price=400;
		smartPhone1.buy();
 }
}
