public class CMDDemo1{

	public static void main(String[] args) {
		
    // read n numbers from the command prompt and find the count and sum
        int sum = 0;

		for(int i=0; i<args.length; i++){

			sum = sum + Integer.parseInt(args[i]);
		}

		System.out.println("Sum = "+sum);
		System.out.println("Count of numbers: "+args.length);
	}
}
