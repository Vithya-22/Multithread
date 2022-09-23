package multithreading;

public class AccountDanger implements Runnable {
	
	public AccountSynchro acct=new AccountSynchro();

	public static void main(String[] args) {
		// TODO Auto-generated method 

		AccountDanger danger=new AccountDanger();
		
		Thread thread1=new Thread(danger);
		Thread thread2=new Thread(danger);
		thread1.setName("vithya");
		thread2.setName("Avina");
		thread1.start();
		thread2.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			makewithdraw(700);
		}
		
	}

	private synchronized void makewithdraw(int amount) {
		// TODO Auto-generated method stub
		
		if(acct.getBalance()>=amount)
		{
			System.out.println(Thread.currentThread().getName() +" is going to withdraw");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acct.withdraw(amount);
			System.out.println(Thread.currentThread().getName() +" complete the withdraw:Balance:"+acct.getBalance());
		}
		else {
			System.out.println("Not enough balance in account for"+Thread.currentThread().getName()+"Balance:"+acct.getBalance());
		}
		
	}
	

}

/*   
- if any thread enters inside synchronized method,that thread will acquire lock on the method,so that no other thread can enter inside a method
 thread will execute it's task.
- After execution ,thread will release the lock.
- After releasing the lock,another thread can enter inside synchronized method .*/
