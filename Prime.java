public class Prime{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		//System.out.println(n);

        int count = 0;
        int i;
		for(i=1; i<=n/2;i++){
			if(n%i==0){
				count++;
                  if(count>1)
                  	break;
		}
	   }
	   System.out.println("no of iterations: "+i);
	   if(count == 1)
	   	System.out.println(n+" is prime");
	   else
	   	System.out.println(n+" is not prime");
}
}