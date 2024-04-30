package sample;
public class VarArgsDemo{
    static void add(int y, int... x){
    int sum = 0;
    for(int i : x)
    sum += i;
    
    System.out.println(sum);
    }

	public final synchronized strictfp static void main(String... cdac) {

    add(123,321);
    add(123,321,1234);
    add(123,321, 1234,4321);
		
	}
}