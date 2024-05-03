package collections;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet(new MyComparator());
		ts.add(123);
		ts.add(321);
		ts.add(567);
		ts.add(1234);
		ts.add(123); // dup
		ts.add(181);
		ts.add(199);
		System.err.println(ts); // ASC  

	}
}

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer i1, Integer i2) {
		
		return i2.compareTo(i1); // DESC
	}
}
