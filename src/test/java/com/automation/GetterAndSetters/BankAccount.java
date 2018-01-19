package com.automation.GetterAndSetters;


public class BankAccount {
	int accountNumber;
	String accountHolder;
	double balance;
	String bank;
	public void deposit(){
		System.out.println("Deposit some money to: "+accountNumber);
	}
	public void transfer(){
		System.out.println("Transfer money from: "+accountNumber);
	}
	public void withdraw(){
		System.out.println("Withdrawing money from: "+accountNumber);
	}
	public void pay(){
		System.out.println("Paying using account: "+accountNumber);
	}
	public void accountInformation(){
		 System.out.println("======================"+"\n"+
				 			"Account number: "+accountNumber + "\n"+
							"Account Holder: "+accountHolder+"\n"+
							"Account balance: "+balance+"\n"+
							"Bank Name: "+ bank);
		

	}
}