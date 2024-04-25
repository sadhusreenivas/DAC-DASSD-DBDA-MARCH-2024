public abstract class ATM{
	
	int cashback;
	double intRate;

	public ATM(int cashback, double intRate){
		this.cashback = cashback;
		this.intRate = intRate;
	}

	public void disp(){
     System.out.println("I am so and so ATM");
	}

	public abstract void withdraw();

	public abstract void transfer();

	public abstract void deposit();

}