package collections;

import java.util.*;

public class ListArray {

	public static void main(String[] args) {
		
		String[] cities = {"Hyd", "KUR", "PUN", "MUM","VTZ"};
		for(String c: cities)
			System.out.println(c);
		
		Arrays.sort(cities);
		for(String c: cities)
			System.out.println(c);
		
		List<String> cl = Arrays.asList(cities); //
		
		List<String> cl1 = new ArrayList();
		
		cl1.addAll(cl);
	    cl1.add("AMT");
	    
	    Iterator itr = cl.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
		
	    Collections.sort(cl1);
	    System.out.println(cl1);
	    
	}
}
