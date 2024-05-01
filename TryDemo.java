package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryDemo {
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int x=0, y=0;
	
	try {
	x = reader.nextInt();
    y = reader.nextInt();
	int s = x+y;
	System.out.println("Sum :"+s);
	int r = x/y; //
	System.out.println("Result "+r);
	}
	
	catch(ArithmeticException | InputMismatchException e) {
		System.err.println(e);
	}
		
	int p = x*y;
	System.out.println("Product :"+p);

	System.out.println(" rest of the code follows");
	}
}
