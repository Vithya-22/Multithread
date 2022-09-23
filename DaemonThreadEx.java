package multithreading;

     //it has no rule in life other than to serve user thread,only provides services for background supporting task.
public class DaemonThreadEx extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThreadEx t1=new DaemonThreadEx();
		DaemonThreadEx t2=new DaemonThreadEx();
		DaemonThreadEx t3=new DaemonThreadEx();
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();

	}
	@Override
	public void run() {
		    if(Thread.currentThread().isDaemon())
		    {
		    	System.out.println("Daemon thread work");
		    	
		    }
		    else {
		    	System.out.println("user thread work");
		    }
	}

}
