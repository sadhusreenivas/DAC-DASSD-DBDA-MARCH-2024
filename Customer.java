public class Customer{
	int cid;
	String name;
	String city;
	static String bank; // static

	static{
		bank = "HDFC";
		System.out.println(bank);
	}
     
     public Customer(int cid, String name, String city){
     	this.cid = cid;
     	this.name = name;
     	this.city = city;
     }
     
    void disp(){
    	System.out.println("CID: "+cid+"\nNAME: "+name+"\nCity: "+city+"\nBANK: "+bank);
    	System.out.println("******************");
    }

    static void change(){
        bank = "SBI";
    }

    public static void main(String[] args) {

    	System.out.println("Hello....this id from main method!");
    	Customer c1 = new Customer(67814567,"ABC","LA");
    	c1.disp();

        Customer.change(); // static 

    	Customer c2 = new Customer(67814789,"XYZ","NY");
    	c2.disp();
    	

    	
    }
}