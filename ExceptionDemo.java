import java.io.*;
public class ExceptionDemo{

     public static void main(String[] args) throws IOException{
     	
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     	System.out.println("Enter Age");
     	String str = br.readLine(); // reads a line of text

     	int age = Integer.parseInt(str); // throw new java.lang.NumberFormatException()
     	System.out.println(age);

     	System.out.println("Rest of the code follow......");

     }
	
}