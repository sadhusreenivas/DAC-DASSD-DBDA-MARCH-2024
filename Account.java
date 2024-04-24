public class Account{
	private int accNo;
	private String accType;
	private double balance;

	public Account(int accNo, String accType, double balance){
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
	}

	public void getAccount(){
		System.out.println("Account No: "+accNo+"\nAccount Type: "+accType+"\nAccount Balance: "+balance);
	}
    
	void calInterest(){
	// si = ptr/100;
		double si = balance*3*6.5/100;
		System.out.println("Interest earned: "+si);
		System.out.println("Total Balance: "+(balance+si));
	}
}