import java.io.*;
class ConsoleDemo{
	public static void main(String[] args) {
		
		Console c = System.console();

		System.out.println("Enter username");
		String userName = c.readLine();

		System.out.println("Enter password");
		char[] pwd = c.readPassword();

		System.out.println(userName+" "+pwd);

	}
}