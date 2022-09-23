package multithreading;

public class AccountSynchro {
	
	private int balance=7000;
	
	public int getBalance() {
		return balance;
		
	}
	public void withdraw(int amount)
	{
		balance=balance-amount;
	}

}
