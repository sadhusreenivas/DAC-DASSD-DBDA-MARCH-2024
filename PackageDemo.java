import java.util.Date; // explicit
//import java.sql.*; // implicit

public class PackageDemo{
	
	public static void main(String[] args) {
		
		Date d = new Date(); //
		System.out.println("Date and Time: "+d);

        // FQN
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter full name");
        String name = s.nextLine();
        System.out.println("NAME: "+name);
		
	}
}