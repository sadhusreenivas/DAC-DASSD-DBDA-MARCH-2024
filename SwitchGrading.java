import java.util.Scanner;
public class SwitchGrading{
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

    switch(avg/10){
     case 10:
     case 9:
     case 8:
     case 7: System.out.println("A grade");
     	     break;
     case 6: System.out.println("B grade");
     	     break;
     case 5: System.out.println("C grade");
     	     break;
     case 4: System.out.println("D grade");
     	     break;
     case 3:
     case 2:
     case 1:
     case 0: System.out.println("FAIL");
     	     break;
     default: System.out.println("Thisn is not required here...but as a syntax");
    }
}
}