import java.util.*;

public class ArrayDemo1{
	public static void main(String[] args) {
		int[] arr = new int[100];
        Scanner reader = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
        	arr[i] = 101 + (int) (Math.random()*900); // 101 - 1000
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

        // finding min aand max
        int min = arr[0];
        int max = arr[0];
         for(int i=0;i<arr.length;i++){
        	if(arr[i] < min)
        		min = arr[i];
        	if(arr[i] > max)
        		max = arr[i];
        }
        System.out.println("Min = "+min+"\nMax = "+max);
        
        // searching an element
        boolean flag = false;
        System.out.println("Please enter the search element");
        int x = reader.nextInt();
         for(int i=0;i<arr.length;i++){
        	if(x == arr[i]){
        		System.out.println("Element "+x+" found at index "+i);
                flag = true;
                break;
        	}
        }
        if(flag == false)
        	System.out.println("Element "+x+" not found");

        // sorting an array
        Arrays.sort(arr); // NSO - ASC
        for(int i : arr)
        	System.out.print(i+" ");
	}
}