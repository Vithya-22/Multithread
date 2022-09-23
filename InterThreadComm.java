package multithreading;

class Customer{

private int amount =10000;

   synchronized void withdraw(int amount) {
	
        System.out.println("going to withdraw");
	     if (this.amount<amount)
{
	System.out.println("less balance...waiting for deposit");
	try {
		wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	this.amount=amount;
	System.out.println("withdraw completes");
   }
	
synchronized void deposit(int amount)
{
	System.out.println("going to deposit rs."+amount);
	this.amount+=amount;
	System.out.println("deposit completes:Balance:rs."+this.amount);
	
	notify();
			
}
	}

public class InterThreadComm {
	
	Customer customer=new Customer();
	{
	
	    new Thread("vithya") {
	    	 public void run() {customer.withdraw(10000);};
	    
	   }.start();
	  
        new Thread("avina") {

		      public void run() {customer.deposit(10000);};
			
		
	   }.start();
}
}
	



