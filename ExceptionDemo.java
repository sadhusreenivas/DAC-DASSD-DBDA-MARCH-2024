package exceptions;
import java.io.*;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
	System.out.println("Enetr name");
	String name = br.readLine();
    
    System.out.println("Welcome to Eclipse from "+name);
    
    Student s1 = new Student(123,"ABC", 8.9);
    System.out.println(s1);
    
	try {
	System.out.println(10/0); // throw new ArithmeticException();
	}
	catch(ArithmeticException e) {
		System.err.println(e);
		System.err.println(e.getMessage()); // error desc
		e.printStackTrace();
	}
	
	System.out.println("Rest of code follows.....");
	
	}
}
