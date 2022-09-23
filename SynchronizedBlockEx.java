package multithreading;

class PrintTable{           //create a class printTable to use synchronized method.
	public void print(int n)
	{
	synchronized (this) {   //it is used to control multiple thread,using this synchronized to execute first thread only then next thread 2 execute.if we can not use this method
		for(int i=1;i<=10;i++) //we get a two thread output at a time and it confused.so we use this method to execute and get correct output.
	
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(n*i);
		}
	}
		
	}
	
}
class thread1 extends Thread{       //create a thread1 class outside main method
	
	PrintTable printTable;              //print the printTable inside this class

	public thread1(PrintTable printTable) {    //create a constructor.super method is not required so remove that.
		this.printTable = printTable;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		printTable .print(3);
	}
	
}
class thread2 extends Thread{          //create a thread2 class outside main method
	
	PrintTable printTable;          //print the printTable method inside this class

	
	public thread2(PrintTable printTable) {
	
		this.printTable = printTable;
	
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		printTable .print(7);
	}
	
}

public class SynchronizedBlockEx {
	public static void main(String[] args) {
		PrintTable printTable=new PrintTable();       //create the object of printable class
		thread1 thread1=new thread1(printTable);      //create object of thread class and call printTable
		thread2 thread2=new thread2(printTable);
		thread1.start();                 //it is a parent class so setName is not required .directly we start a thread.
		thread2.start();
		
		
	}

}
