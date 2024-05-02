package multithreading;

public class MainClass {

	public static void main(String[] args) {
		
		Table table = new Table();
		
		Thread1 t1 = new Thread1(table);
		Thread2 t2 = new Thread2(table);
		Thread3 t3 = new Thread3(table);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
