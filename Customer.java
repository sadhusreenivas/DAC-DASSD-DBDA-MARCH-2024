package multithreading;
import java.io.*;
public class Customer {
	double balance;
	public Customer(double balance) {
		this.balance = balance;
	}
	 public void getBalance() {
		 System.out.println(balance);
	 }

	public synchronized void withdraw(int amount) throws InterruptedException {
		System.out.println("Going to Withdraw");
		if(balance < amount) {
			System.out.println("Less balance: waiting for deposit");
			wait(); // blocked
		}
		
		balance = balance - amount;
		System.out.println("Withdrawn amount");
		getBalance();	
	}
	 
	public synchronized void deposit(int amount){
		System.out.println("Going to deposit");
		balance = balance + amount;
		getBalance();
		notify(); // 
	}
}
