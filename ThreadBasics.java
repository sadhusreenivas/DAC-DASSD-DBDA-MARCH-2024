package multithreading;
public class ThreadBasics extends Thread {

	 public void run() {
		 
		 System.out.println(Thread.currentThread().getName());
		 System.out.println(Thread.currentThread().getPriority());
	 }
	
	public static void main(String[] args) {
		
       ThreadBasics t1 = new ThreadBasics();
       t1.setName("first");
       ThreadBasics t2 = new ThreadBasics();
       t2.setPriority(MAX_PRIORITY);
       ThreadBasics t3 = new ThreadBasics();
       t3.setName("third");

       t3.setDaemon(true);
       t1.start();
       t2.start();
       t3.start();
       
       System.out.println(t3.isDaemon()); // true
	}

}
