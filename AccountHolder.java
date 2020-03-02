package com.meritamerica.assignment1;

public class AccountHolder { 
	
	//Declare variables
	String firstName;  // name 
	String middleName;
	String lastName;
	String ssn;
	CheckingAccount checkingAccount; 
	SavingsAccount savingsAccount;
	double balance;
	
	//get first name from User
	public String getFirstName() {
		return this.firstName;
	}
	//set first name
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	//get middle name from User
	public String getMiddleName() {
		return this.middleName;	
	}
	
	//set middle name
	public void setMiddleName(String name) {
		this.middleName = name; 
	}	
	
	//get last name
	public String getLastName() {
		return this.lastName;
	}
	
	//set last name
	public void setLastName(String name) {
		this.lastName = name;
	}
	
	//get SSN
	public String getSSN() {
		return this.ssn;
	}
	
	//set SSN
	public void setSSN(String number) {
		this.ssn = number; 
	}
	
	//get checking account number
	public CheckingAccount getCheckingAccount() {
		return this.checkingAccount;
	}
	
	//get savings account number
	public SavingsAccount getSavingsAccount() {
		return this.savingsAccount;
	}

	
	@Override
	public String toString() {
		
		return "Name: " + firstName + " " + middleName + " " + lastName  //Return name
				+"SSN: " + ssn //Return social
				+"Checking Account Balance: $" + checkingAccount.getBalance() //Return balance
				+"Checking Account Interest Rate: $"+checkingAccount.getInterestRate()  //Return checking account interest rate
				+"Checking Account Balance in 3 years: $"+checkingAccount.futureValue(3) //Return checking value in 3 years
				+"Savings Account Balance: $"+savingsAccount.getBalance() //Return savings account balance
				+"Savings Account Interest Rate: $"+savingsAccount.getInterestRate() //Return savings account interest rate
				+"Savings Account Balance in 3 years: $"+savingsAccount.futureValue(3); //Return savings value in 3 years
	} 
		
	//Default constructor to initialize Account Holder Info
	public AccountHolder (String firstName, String middleName, String lastName,  //Default 
			String ssn, double checkingAccountOpeningBalance, 
			double savingsAccountOpeningBalance)
	{
		CheckingAccount checking = new CheckingAccount(checkingAccountOpeningBalance);
		this.checkingAccount = checking;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;

		SavingsAccount savings = new SavingsAccount(savingsAccountOpeningBalance);
		this.savingsAccount = savings;
	
	}
	

	 
}