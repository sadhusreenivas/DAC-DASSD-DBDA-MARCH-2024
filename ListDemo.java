package collections;
import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		System.out.println(al.size());
		//al.add(501510);
		al.add("C-DAC Hyd");
		//al.add(39.5);
		//al.add(true);
		//al.add('A');
		al.add("Hardware Park");
		al.add("Hyderabad");
		al.add("Telangana");
		al.add("C-DAC Hyd"); // duplicate
		
		System.out.println(al);
		System.out.println(al.size());
		
		// Iterator object - universal cursor
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.reverse(al); // 
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}

}
