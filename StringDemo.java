public class StringDemo{
	
	public static void main(String[] args) {
		
		String s1 = "James";
		String s2 = "Gosling";
        s1.concat(s2);
        System.out.println(s1); // James 

        String s3 = "Sachin" + "Tendulkar";
        System.out.println(s3);

        String s4 = new StringBuffer().append("Sachin").append("Tendulkar").toString();
        System.out.println(s4);

        String s5 = new StringBuilder().append("Sachin").append("Tendulkar").toString();
        System.out.println(s5);

		
	}
}