package collections;
import java.util.*;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		System.out.println(s.capacity()); //10
		s.add(10);
		s.add(3.14);
		s.addElement(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s);
		
		System.out.println(s.pop()); // 50
		System.out.println(s.peek()); //40
		System.out.println(s.pop()); // 40
		s.push(60);
		s.push("C-DAC");
		System.out.println(s);
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Enumeration en = s.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

	}

}
