package bankAccounts;

public class BankAccountMain {

	public static void main(String[] args) {
	
    //create account objects
	BankAccount acc1 = new BankAccount("Liam Lynch", 0001);
	BankAccount acc2 = new BankAccount("John Smith", 0002);
    
	//Deposit and Withdraw
	acc1.deposit(5120);
	acc2.deposit(1000);	
	
	acc1.withdraw(100);
	
	System.out.println(acc1.toString());
	System.out.println(acc2.toString());
	
	}

}
