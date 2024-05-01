package exceptions;
public class NestedTry {
	public static void main(String[] args) {
		try {
		System.out.println("Handling exceptions");
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = 1+ (int) (Math.random()*10); // 1-10
		}
		try {
        arr[5]= 99;  //  AIOBE
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
        String s = null;
        System.out.println(s.length()); // NPE
		}catch(NullPointerException e) {
			System.err.println(e);
		}
        System.out.println("about to leave outer try");
		}
		catch(ArithmeticException e) {
			System.out.println("Handled!");
		}
		finally {
			// close resources
			System.out.println("All resources closed");
		}
		System.out.println("Rest of the code follows");
	}

}
