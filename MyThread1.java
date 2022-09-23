package multithreading;

public class MyThread1 extends Thread {
	@Override
	public void run() {
		
		while(true)
		{
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Executing thread:"+getName());//we use extends  its a parent class so we get name directly
		}
	}
	
public static void main(String[]args) {
	
	MyThread1 thread1=new MyThread1();
	thread1.setName("Thread1");
	thread1.start();
	
	MyThread1 thread2=new MyThread1();
	thread2.setName("Thread2");
	thread2.start();
	
	System.out.println("Hello");
}
}
