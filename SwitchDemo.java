import java.util.Scanner;
public class SwitchDemo{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter fav color");
        String color = reader.next();

        switch(color.toLowerCase()){
        case "red": System.out.println("Roses are red!\nSun is red");
        	        break;
        case "blue": System.out.println("Sky is blue\nWater is Blue");
        	         break;
        case "black":System.out.println("Black is beauty!");
        	         break;
        case "green": System.out.println("Earth is Green\n");
         	         break;
        default: System.out.println("Please enter RGB or K colors");

        }

	}
}