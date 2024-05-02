package multithreading;

public class DriverMain {
	public static void main(String[] args) {
		
		Table table = new Table();
		
		new Thread() {
			public void run() {
				table.printTable(19);
			}
		}.start();
		
		new Thread() {
			public void run() {
				table.printTable(18);
			}
		}.start();
		
		new Thread() {
			public void run() {
				table.printTable(17);
			}
		}.start();
		
		new Thread() {
			public void run() {
				table.printTable(16);
			}
		}.start();
	
	}
}
