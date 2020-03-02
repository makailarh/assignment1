package com.meritamerica.assignment1;

public class SavingsAccount {
	
	//declare variables
	double balance;
	double interestRate = 0.01;

	//initialize a constructor
		public SavingsAccount(double openingBalance){
			balance = openingBalance;
	}
		
	//get account balance
		public double getBalance() {
			return this.balance;	
		}		
	
	//get interest rate
		public double getInterestRate() {
			return this.interestRate;
		}
		//withdraw amount
		public boolean withdraw(double amount) {
			if ((balance-amount)<0) {
				return false;
			}
			else {
				 balance -= amount;
				return true;
				}
		}	
		//deposit amount
		public boolean deposit(double amount) {
			if (amount < 0)	{
				System.out.print("You can only deposit positive amounts");
				return false;
			}
			else {
				balance += amount;
				return true;
			}
						
		}
		//future Value
		//FV = PV(1+i)^n	
		public double futureValue(int years) {
			double futureValue = balance * Math.pow((1+interestRate),years);
			return futureValue;
		}

		@Override
		public String toString() {
			
			return 
				"Savings Account Balance: $" +getBalance() //Return balance
				+"Savings Account Interest Rate: $"+getInterestRate()  //Return savings account interest rate
				+"Savings Account Balance in 3 years: $"+futureValue(3); //Return savings value in 3 years
		}
		
		}

		