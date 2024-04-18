public class Factors{
	public static void main(String[] args) {
		int n = 1+ (int)(Math.random()*100); // 1-100
		System.out.println(n);

        int count = 0;
		for(int i=1; i<=n;i++){
			if(n%i==0){
				count++;
				System.out.println("Factor "+count+": "+i);
			}
		}
		System.out.println("No of factors:"+count);
	}
}