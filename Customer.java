public class Customer{ // fully encapsulated class
	private int cid;
	private String name;
	private String city;
	private static String bank = "SBI";
	private Account acc; // object reference
 
    public Customer(int cid, String name, String city, Account acc){
     	this.cid = cid;
     	this.name = name;
     	this.city = city;
     	this.acc = acc;
     }
     
    public void disp(){
    	System.out.println("CID: "+cid+"\nNAME: "+name+"\nCity: "+city+"\nBANK: "+bank);
    	acc.getAccount(); // account details
    	acc.calInterest(); // interest earned
    	System.out.println("******************");
    }

   }
