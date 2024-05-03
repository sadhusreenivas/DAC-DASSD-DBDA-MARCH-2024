package collections;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> ll = new LinkedList();
		ll.add("Rohit");
		ll.add("Dhoni");
		ll.add("Sachin");
		ll.add("Iyer");
		ll.add("Bumra");
		ll.add("Jadeja");
		ll.add("Siraj");
		ll.add("Bhuvi");
		System.out.println(ll);
		
		ListIterator<String> itr = ll.listIterator();
		 while(itr.hasNext()) {
			 
			 String str = itr.next();
			 if(str.equals("Sachin")) {
				 itr.set("Virat");
			 }
			 if(str.equals("Bhuvi")) {
				 itr.remove();
			 }
		 }
		 System.out.println(itr.previous());
		 
          System.out.println(ll);
	}

}
