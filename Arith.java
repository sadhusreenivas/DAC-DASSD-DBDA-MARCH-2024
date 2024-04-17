public class Arith{

	public static void main(String[] args) {
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);

	int s = a+b;
	System.out.println("Sum= "+s);

    try{
	int r = a/b;
	System.out.println("Res= "+r);
    } catch(ArithmeticException e) {
    	System.err.println(e);
    }

    int p = a*b;
	System.out.println("Product= "+p);

   int m = a%b;
	System.out.println("Rem= "+m);
}
}