public class P{
	private static int data = 99;

	static class Q{
		static void msg(){
			System.out.println("accessing static data of outer class: "+data);
		}
	}

	public static void main(String[] args) {
		
		P.Q.msg(); // 

		}
}