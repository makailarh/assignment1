package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main (String[] args) {  // Main class
		
		AccountHolder name = new AccountHolder("John", "James", "Doe",
				"123-45-6789", 100, 1000); //Define parameters
		
		//Display account holder's toString output
		name.toString();
		
		name.checkingAccount.deposit(500); //Add $500
		name.savingsAccount.withdraw(800); //Withdraw $800
		
		//Display checking account
		name.checkingAccount.toString();
		
		//Display savings account
		name.savingsAccount.toString();
		
		AccountHolder name1= new AccountHolder ("Amy", "Marie", "Aphrens",
				"123-66-7890", 200, 500); //Define new account holder parameters
		
		//Display account holder's toString output
		name1.toString();
		
		name1.checkingAccount.deposit(-500); //Add $-500
		name1.savingsAccount.withdraw(600); //Withdraw $600

		//Display checking account
		name1.checkingAccount.toString();
		
		//Display savings account
		name1.savingsAccount.toString();
		
	
	}
}