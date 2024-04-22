public class MethodDemo{
   // method definition
   static void factorial(int[] arr){ // n - formal
   	for(int x:arr){

     int fact = 1;
     for(int i=1; i<=x; i++)
     fact *= i;

     System.out.println(x+"! : "+fact);
    }
}
	public static void main(String[] args) {
     
      int[] numbers = {4,5,6,7,8,9,10,11,12,13,14};
      factorial(numbers);
     }
}
