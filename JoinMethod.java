package multithreading;

public class JoinMethod extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JoinMethod t1=new JoinMethod();
		JoinMethod t2=new JoinMethod();
		JoinMethod t3=new JoinMethod();
		
		t1.start();
		try {                   //we use join method   to execute the one then another.so we will get output clear.if we can not use 
			t1.join();          //we get 3 thread output at same .
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();

	}
@Override
public void run() {
	for(int i=1;i<=5;i++)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
	}
	
}
}
