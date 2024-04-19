public class NestedFor{

	public static void main(String[] args) {
		
		for(int i=11; i<=9999999; i++){
           System.out.println("Printing Table: "+i);

           for(int j=1; j<=10; j++){
           	System.out.println(i+" * "+j+" = "+ (i*j));
           }

		}
	}
}