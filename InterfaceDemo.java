public class InterfaceDemo implements Showable{
	
	public void show(){
		System.out.println("Display the content!");
	}

    public void print(){
    	System.out.println("Printing......!!");
    }
	public static void main(String[] args) {
		
		Showable s = new InterfaceDemo();
		s.show();
		s.print(); //
	}
}