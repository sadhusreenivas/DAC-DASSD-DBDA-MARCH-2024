package multithreading;

public class Thread1 extends Thread{
	Table t;
	public Thread1(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(19);
	}
}

class Thread2 extends Thread{
	Table t;
	public Thread2(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(18);
	}
}

class Thread3 extends Thread{
	Table t;
	public Thread3(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(17);
	}
}