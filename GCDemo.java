package collections;

public class GCDemo {
	
	protected void finalize() {
		System.out.println("GC invoked....");
		System.out.println("To write clean up code");
	}

	public static void main(String[] args) {
		
		GCDemo[] gcArr = new GCDemo[10]; // array of objects 
		
		for(int i=0; i<gcArr.length;i++) {
			gcArr[i] = new GCDemo();
		}
		
		gcArr = null;
		
		System.gc(); // invoking GC 
      
	}

}
