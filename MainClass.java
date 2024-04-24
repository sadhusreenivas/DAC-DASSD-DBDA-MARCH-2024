public class MainClass{
	public static void main(String[] args) {
		
        Account a1 = new Account(8629,"Savings",30000);
        Customer c1 = new Customer(57815645, "ABC","Hyd", a1);
        c1.disp(); // cust info + acc info + interest

		}
} 