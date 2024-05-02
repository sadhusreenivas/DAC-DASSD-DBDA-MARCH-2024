package multithreading;

public class MultiDemo extends Thread{
	
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		MultiDemo t1 = new MultiDemo();
		t1.start(); // 
		
		t1.join(1500); // the thread to die
		
		MultiDemo t2 = new MultiDemo();
		t2.start();
		
		MultiDemo t3 = new MultiDemo();
		t3.start();
			
	}

}
