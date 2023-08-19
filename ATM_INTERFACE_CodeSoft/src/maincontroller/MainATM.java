package maincontroller;

import service.ATM;
import service.BankAccount;

public class MainATM {

	 public static void main(String[] args) {
	        BankAccount userAccount = new BankAccount(1000.0); // Initialize with an initial balance
	        ATM atm = new ATM(userAccount);
	        atm.performTransaction();
	    }
}
