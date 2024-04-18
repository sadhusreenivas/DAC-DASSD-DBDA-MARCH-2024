public class Armstrong{
	public static void main(String[] args) {
	int n = Integer.parseInt(args[0]);
    int x = n; //
    int a=0;

    while(n>0){
    	int d = n%10;
        a = a + (int) Math.pow(d,3); // business
        n = n/10;
    }
 
    if(a == x)
    	System.out.println(a+ " is Armstrong number");
    else
    	System.out.println(a+" is not armstrong");
	}
}