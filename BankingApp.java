package exceptions;
public class BankingApp {
	private double balance;
	public BankingApp(double balance) {
		this.balance = balance;
	}
	void dispBalance() {
		System.out.println("Balance: "+balance);
	}

    public void withdraw(int amount) throws InsufficientFundsException{
    	if(balance < amount)
    		throw new InsufficientFundsException("less balance");
    	else {
    		balance -= amount;
    		System.out.println("Withdraw success");
    	}
    	System.out.println("Updated Balance: "+balance);
    }
	public static void main(String[] args) {
		
		BankingApp b1 = new BankingApp(45000);
		b1.dispBalance();
		
		try {
			b1.withdraw(20000); 
			b1.withdraw(30000); //
		}
		catch(Exception e) {
			System.err.println(e);
		}
		finally {
			if(b1 != null)
				b1 = null;
			System.out.println("Resource closed!");
		}
		
		System.out.println("Rest of the code follows.....");
       
	}

}
