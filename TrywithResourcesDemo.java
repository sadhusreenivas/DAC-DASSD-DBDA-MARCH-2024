package exceptions;
import java.io.*;
public class TrywithResourcesDemo {

	public static void main(String[] args) throws IOException{
		
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("Enter Age");
			int age = Integer.parseInt(br.readLine());
		    System.out.println("Age: "+age);
		}
		catch(Exception e) {
			System.err.println(e);
		}       
		System.out.println("Rest of the code follows.....");
	}
}
