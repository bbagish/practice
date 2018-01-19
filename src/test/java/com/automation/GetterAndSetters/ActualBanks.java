package com.automation.GetterAndSetters;


public class ActualBanks {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		account1.accountNumber = 1234567;
		account1.accountHolder = "Bill Gates";
		account1.balance = 1000;
		account1.bank = "TDBank";
		// call methods
		account1.deposit();
		account1.pay();
		account1.transfer();

		System.out.println(account1.accountHolder);
		System.out.println("Current balance: " + account1.balance);

		account1.accountInformation();
		account1.accountInformation();

	}
}
