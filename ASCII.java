// printable chars of ASCII
public class ASCII{
   
	public static void main(String[] args) {
		int c = 0;
		for(int i=33; i<=126;i++){
			System.out.print(" "+i+"->"+(char)i+" ");
			c++;
			if(c%10==0)
				System.out.println();
		}
     
		System.out.println("\n"+'a'+'b');

	}
	
}