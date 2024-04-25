public class Bank extends ATM{

    private int incentive;

    public Bank(int cashback, double intRate, int incentive){
    	super(cashback, intRate);
        this.incentive = incentive;
    }

	// non - pvt members are available for use
	public void withdraw(){
    System.out.println("withdraw success and you got cashback of "+cashback);
	}
	public void transfer(){
    System.out.println("transferred amount and your incentive is "+incentive);
	}
	public void deposit(){
    System.out.println("Amount deposited and you wl get interest @ rate of "+ intRate);
	}

	public void display(){
		System.out.println("I am so and so bank");
	}

	public static void main(String[] args) {
		ATM a = new Bank(10, 6.5, 15);
		a.withdraw();
		a.deposit();
		a.transfer();
		a.disp();
		Bank b = new Bank(10, 6.5, 15);
		b.display(); //
	}

}