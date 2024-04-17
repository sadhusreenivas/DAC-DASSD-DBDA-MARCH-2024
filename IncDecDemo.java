public class IncDecDemo{
	
	public static void main(String[] args) {
		
		int a=10;

		int x = a++ + ++a;
		System.out.println(x); //22
		System.out.println(a); //12
	}

}