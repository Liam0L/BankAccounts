package bankAccounts;

public class BankAccount {

	private String name;
	protected double balance;
	private int accountnumber;
	
	//Default Constructor
	public BankAccount() {
		
	}
	
	//Variable Constructor
	public BankAccount(String name, int accountnumber) {
		this.name = name;
		this.accountnumber = accountnumber;
		balance = 0.0;
		
	}
	
	//Deposit method :
	//1. Amount must be > 0 
	public void deposit(double amount) {
		
		//Check Amount
		if(amount > 0) {
			balance = balance + amount;
		}
		//Error Message
		else {
			System.out.println("Amount to be Deposited must be above zero");
		}
	}
	
	//Withdraw method :
	// 1. Amount to withdraw must be > 0
	// 2. must be <= balance
	public void withdraw(double amount) {
		
		//Check Amount
		if(amount > 0) {
			//Check Balance
			if(amount <= balance) {
				balance = balance - amount;
			}
	    }
		//Error Message
		else {
			System.out.println("Amount to be Withdrawn must be above zero and must not be greater than current Balance");
		}
	}
    //Get Name
	public String getName(String name) {
		return this.name;
	}
	//Get AccountNumber
	public int getAccountNumber() {
		return this.accountnumber;
	}
	
	//Get Balance
	public double getBalance() {
		return balance;
	}
	
	//toString Method
	public String toString() {
		
		return String.format("%s: Balance = %.2f", getName(name), getBalance() );
		
	}
}
