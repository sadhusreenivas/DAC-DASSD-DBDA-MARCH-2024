package collections;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		
		 Set ts1 = new TreeSet(new MyCompName());
		 
		 ts1.add(new Emp(123,"Sharon",40000));
		 ts1.add(new Emp(321,"Vinay",40000));
		 ts1.add(new Emp(111,"Antesh",40000));
		 ts1.add(new Emp(222,"Sakshi",40000)); 
		 ts1.add(new Emp(333,"Priya", 40000));
		 
		 Set ts2 = new TreeSet(new MyCompEid());
		 ts2.add(new Emp(123,"Sharon",40000));
		 ts2.add(new Emp(321,"Vinay",40000));
		 ts2.add(new Emp(111,"Antesh",40000));
		 ts2.add(new Emp(222,"Sakshi",40000)); 
		 ts2.add(new Emp(333,"Priya", 40000));
		 
		 
		 Iterator itr1 = ts1.iterator();
		 while(itr1.hasNext()) {
			 Emp e = (Emp) itr1.next();
			 System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsal()+" "+e.getOrg());
		 }
		 
		 System.out.println("********************************");
		 
		 Iterator itr2 = ts2.iterator();
		 while(itr2.hasNext()) {
			 Emp e = (Emp) itr2.next();
			 System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsal()+" "+e.getOrg());
		 }
	}
}

class MyCompName implements Comparator<Emp>{
	@Override
	public int compare(Emp e1, Emp e2) {
		String s1 = e1.getEname();
		String s2 = e2.getEname();
		
		return s1.compareTo(s2); // DSC
	}				
}

class MyCompEid implements Comparator<Emp>{
	@Override
	public int compare(Emp e1, Emp e2) {
		
		if(e2.getEid()>e1.getEid())
			return 1;
		else 
			return -1;
	}				
}


