package bankAccounts;

//LoanAccount class. Derived from BankAccount class.
public class LoanAccount extends BankAccount {

	private double overdraftlimit;
	private double interestrate;
	private double interest;
	
	//Constructor
	public LoanAccount(String name, int accountnumber, double overdraftlimit, double interestrate) {
		
		overdraftlimit = 0.0;
		this.interestrate = interestrate;	
	}
	
	//set overdraft limit
	public void setOverdraftLimit(double overdraftlimit) {
	  
		this.overdraftlimit = overdraftlimit;
	}
    
	//get Overdraft limit
	public double getOverdraftLimit() {
		return overdraftlimit;
	}
	
	//Override Withdraw Method
	public void withdraw(double amount) {
		//Check Amount
				if(amount > 0)  {
					    //Check amount is within balance + overdraft limit
					    if(amount <= balance + overdraftlimit) {
					    	
						balance = balance - amount;		
					}
			    }
				//Error Message
				else {
					System.out.println("Withdraw amount must be above 0 and must be within range of balance plus overdraft limit");
				}
		
	}
	
	//Calculate Interest
	public void setInterest(double balance, double interest) {
		
		//Check Balance is positive
		if(balance >= 0) {
		
			interest = 0;
		}
		//If negative
			else {
					interest = balance * interestrate;	
			}
		}
	public double getInterest() {
		return interest;
		
		}
}

