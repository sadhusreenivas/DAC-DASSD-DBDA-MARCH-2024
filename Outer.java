public class Outer{
	private int data = 99; // 1
    // member inner class
	class Inner{ // 2
		void msg(){
           System.out.println("Accessing Outer class pvt data: "+data);
		}
	} // Inner
   
    public void display(){ // 3
     Inner in = new Inner();
     in.msg();
    }

	public static void main(String[] args) {
		
		Outer out = new Outer(); // outer object
		out.display();
		
	}
}// outer class