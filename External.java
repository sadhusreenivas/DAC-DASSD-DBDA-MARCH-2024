public class External{
	
	private int data = 99;

	public void display(){
    // define class here
		class Local{
			void msg(){
				System.out.println(" Accessing private data of outer class: "+data);
			}
		} // end of Local class

		Local local = new Local();
        local.msg();
	}

	public static void main(String[] args) {
		External ext = new External();
		ext.display(); //
	}
} 