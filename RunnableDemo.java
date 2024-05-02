package multithreading;
public class RunnableDemo implements Runnable{
	@Override
	public void run() {
		for(int i=2; i<=25;i=i+2) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}	
	}
	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo(); // r1 - Runnable instance
		RunnableDemo r2 = new RunnableDemo(); // r2 - Runnable instance
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		t1.start();
		t2.start();
		
		
	}
}
