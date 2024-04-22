public class StrongNumber{
    // method to find factorial
	static int factorial(int n){
			int f = 1;
			for(int i=1;i<=n;i++)
				f *= i;

			return f;
		}

	public static void main(String[] args) {
		// 145 = 1!+4!+5! = 145
        int x = Integer.parseInt(args[0]);
        int y = x;
        int sum = 0;
        while(x>0){
        	int d = x%10;
            sum = sum + factorial(d);
        	x = x/10;
        }
       
       if(sum == y)
       	System.out.println(y+ " is a Strong Number");
       else
       	System.out.println(y+" is not Strong Number");
	}
}