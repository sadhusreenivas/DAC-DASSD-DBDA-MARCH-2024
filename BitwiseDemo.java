public class BitwiseDemo{
	
	public static void main(String[] args) {
		
		int a = 4;
		int b = 3;
		System.out.println(a&b); //0
		System.out.println(a|b); // 7
		System.out.println(~a); // -5
		System.out.println(a^b); // 7
		System.out.println(a<<1); //8
		System.out.println(a<<2);// 16
		System.out.println(a>>1); //2
		System.out.println(a>>2); //1
		System.out.println(a>>>1); //1
	}
}