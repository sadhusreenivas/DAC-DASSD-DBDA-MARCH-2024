public class SBI implements RBI, TTP{
   static String name = "SBI"; //
	public void withdraw(){
		System.out.println("withdraw success and "+INCENTIVE);
	}
	public void transfer(){
		System.out.println("transferred the amount "+INCENTIVE);
	}
	public void deposit(){
		System.out.println("Deposited!!"+INCENTIVE);
	}
     public void disp(){
     	System.out.println(name);
     }
    public void confirmTransaction(){
       System.out.println("Transaction confirmed!");
    }

    public static void main(String[] args) {
    	RBI r = new SBI();
    	r.withdraw();
    	r.transfer();
    	r.deposit();


    	SBI s = new SBI();
    	s.disp();

    	s.confirmTransaction();
    }

}