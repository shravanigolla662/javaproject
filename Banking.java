package anudip;

public class Banking {
	int account_num;
	int account_balance;

	// Constructor to initialize account number and balance
	public Banking(int account_num, int account_balance) {
		super();
		this.account_num = account_num;
		this.account_balance = account_balance;
	}
	
	// Method to deposit money into the account
	void deposit(int amount) {
		account_balance+=amount;
		System.out.println("New Balance:"+account_balance);
	}
	
	// Method to withdraw money from the account
    void Withdraw(int amount) throws InsufficientBalanceExecption {
    	// Check if the withdrawal amount is less than the account balance
        // and also ensure the account maintains a minimum balance of 1000
    	if(account_balance-amount>1000) {
    		account_balance-=amount;
    		System.out.println("Amount Withdrawn Successfully"+amount+"\n New balance"+account_balance);
    	}
    	else
    		// Throw custom exception if withdrawal is not allowed due to insufficient balance
    		throw new InsufficientBalanceExecption("Insufficient Balance");
		
	}

    // Main method to demonstrate the functionality of the Banking class
	public static void main(String[] args) throws InsufficientBalanceExecption{
		// Create an instance of Banking class with initial account details
		Banking b=new Banking(1110123456,50000);
		
		 // Perform a deposit operation
		b.deposit(20000);
		try {
			// Attempt to withdraw an amount that exceeds the allowed limit
			b.Withdraw(60000);
		}catch(InsufficientBalanceExecption e){
			// Catch and handle the custom exception
			System.out.println(e);
		}

	}

}
