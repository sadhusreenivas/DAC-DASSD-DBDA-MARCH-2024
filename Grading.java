import java.util.Scanner;
public class Grading{
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
    System.out.println("Enter marks in 3 modules");
    int m1 = reader.nextInt();
    int m2 = reader.nextInt();
    int m3 = reader.nextInt();

    
    if((m1<0 || m1>100) || (m2<0 || m2>100) || (m3<0 || m3>100) ){
       System.out.println("Invalid Marks");
       return;
    }

    if(m1<40 || m2<40 || m3 <40){
    	System.out.println("FAIL");
    	return;
    }


    int avg = (m1+m2+m3)/3;
    System.out.println("Average of Marks: "+avg);

    if(avg>=70)
    	System.out.println("A grade");
    else if(avg>=60)
    	System.out.println("B grade");
    else if(avg>=50)
    	System.out.println("C grade");
    else if(avg>=40)
    	System.out.println("D grade");
    else
    	System.out.println("FAIL");
	}
}