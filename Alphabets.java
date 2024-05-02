package multithreading;

public class Alphabets {
	
	public synchronized void dispUpper() {
		for(int i = 65; i<=90; i++) {
			System.out.println((char)i);
		}
	}

	public synchronized void dispLower() {
		for(int i = 97; i<=122; i++) {
			System.out.println((char)i);
		}
	}
	
	
	public synchronized void dispASCII() {
		for(int i = 65; i<=122; i++) {
		    if(i>90 && i<97)
			continue;
		
			System.out.println((i));
		}
	}
}
