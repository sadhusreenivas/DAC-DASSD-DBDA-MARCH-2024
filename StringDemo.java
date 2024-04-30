public class StringDemo{
	
	public static void main(String[] args) {
		
		String s1 = "James";
		String s2 = "Gosling";
        s1.concat(s2);

		System.out.println(s1); // immutabble


		StringBuffer sb1 = new StringBuffer("James");
		StringBuffer sb2 = new StringBuffer("Gosling");

		sb1.append(sb2);
		System.out.println(sb1); // mutable
	}
}