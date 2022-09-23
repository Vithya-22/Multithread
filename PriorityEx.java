package multithreading;

public class PriorityEx extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityEx thread1=new PriorityEx();
		PriorityEx thread2=new PriorityEx();
		thread1.setName("vithya");
		thread2.setName("Avina");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(MAX_PRIORITY);
		thread1.start();
		thread2.start();

	}
	@Override
	public void run() {
		
		System.out.println("Thread Name:" +getName() +" Thread priority:"+getPriority());
	}

}
