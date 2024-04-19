public class ArrayDemo{
	public static void main(String[] args) {
		java.util.Scanner reader = new java.util.Scanner(System.in);
		int[] arr = new int[10];
        System.out.println("Enter "+arr.length+ " elements");
        for(int i=0;i<arr.length;i++){
        	arr[i] = reader.nextInt();
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        // sum and avg of array elememts
        int sum = 0;
        for(int i=0;i<arr.length;i++){
        	sum += arr[i];
        }
        System.out.println("Sum ="+sum);
        double avg = (double)sum /arr.length;
        System.out.println("Average ="+avg);

	}
}