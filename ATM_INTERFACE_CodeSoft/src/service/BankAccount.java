package service;

//Create a class to represent the user's bank account, which stores the account balance.
public class BankAccount {

	private double balance;

	
	//Connect the ATM class with the user's bank account class to access and modify the account balance.
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	//Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals)
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposit successful.");
			System.out.println(" \t New balance: " + balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful.");
			System.out.println("\t New balance: " + balance);
		} else {
			System.out.println("Insufficient funds or invalid withdrawal amount.");
		}
	}
}
