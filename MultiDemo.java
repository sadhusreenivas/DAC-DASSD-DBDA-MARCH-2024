package multithreading;

public class MultiDemo extends Thread{
	
	public void run() {
		for(int i=1; i<=15;i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		MultiDemo t1 = new MultiDemo();
		t1.start(); // 
		
		for(int i=15; i<=30;i++)
			System.out.println(i);
		
	}

}
