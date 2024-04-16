// import java.lang.*;
public class Driver{
	
public static void main(String[] args) {
	int c=0;
	// random number in ints 350 - 500
    for(int i=1; i<=150;i++){

	int n = 350 + (int)(Math.random()*151);
	
	System.out.print(" "+n+" ");
	c++;
	if(c%15 == 0)
		System.out.println();

    }
}

}