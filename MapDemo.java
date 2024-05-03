package collections;
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		
		Map<String, Integer> hm = new TreeMap();
		
		hm.put("ABC", 5400);
		hm.put("XYZ", 6600);
		hm.put("ASDF", 7600);
		hm.put("QWERTY", 10000);
		hm.put("PQR", 4400);
		System.out.println(hm);
		
		// collection Views 
		Collection c1 = hm.keySet();
		System.out.println(c1);
		Collection c2 = hm.values();
		System.out.println(c2);
		
		// Iterating a map
		Set s = hm.entrySet(); //
		Iterator<Map.Entry<String, Integer>> itr = s.iterator(); 
		
		while(itr.hasNext()) {
			Map.Entry m = itr.next();
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}

}
