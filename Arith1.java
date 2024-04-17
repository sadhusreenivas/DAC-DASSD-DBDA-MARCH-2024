public class Arith1{

	public static void main(String[] args) {
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);

	double s = a+b;
	System.out.println("Sum= "+s);

    
	double r = a/b;
	System.out.println("Res= "+r);
    
    double p = a*b;
	System.out.println("Product= "+p);

   double m = a%b;
	System.out.println("Rem= "+m);
}
}