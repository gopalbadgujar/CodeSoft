package service;

import java.util.Scanner;

//Create a class to represent the ATM machine.
public class ATM {
	
	 Scanner scanner = new Scanner(System.in);
	    private BankAccount account;

	    public ATM(BankAccount account) {
	        this.account = account;
	    }

	    public void displayOptions() {  
	    	//Design user interface for ATM, including options such as withdrawing, depositing, & checking balance.
	    	System.out.println("******************************");
	    	System.out.println("##                          ##");
	        System.out.println("!!         ATM Menu:        !!");
	        System.out.println("!!##      **********      ##!!");
	        System.out.println("!!      1. Check Balance    !!");
	        System.out.println("!!      2. Deposit          !!");
	        System.out.println("!!      3. Withdraw         !!");
	        System.out.println("!!      4. Exit             !!");
	    	System.out.println("##                          ##");
	    	System.out.println("******************************");
	    }

	    public void performTransaction() {
	    	boolean flag = true;
	        while (flag) {
	            displayOptions();
	            System.out.print("Enter option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    deposit();
	                    break;
	                case 3:
	                    withdraw();
	                    break;
	                case 4:
	    //Display appropriate messages to the user based on their chosen options and the success or failure of their transactions
	                    System.out.println("Exiting ATM. Have a nice day!");
	                    flag = false;
	                    break;
	                default:
	                    System.out.println("Invalid option. Please select a valid option.");
	            }
	        }
	    }   

	    //Implement methods for each option, such as withdraw(amount), deposit(amount), & checkBalance().
	    private void checkBalance() {
	        System.out.println("Current balance: " + account.getBalance());
	    }

	    private void deposit() {
	        System.out.print("Enter deposit amount: ");
	        double amount = scanner.nextDouble();
	        account.deposit(amount);
	    }

	    private void withdraw() {
	        System.out.print("Enter withdrawal amount: ");
	        double amount = scanner.nextDouble();
	        account.withdraw(amount);
	    }
	}


