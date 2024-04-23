public class Student{
	// data 
	int rollNo; // primitive + instance - heap
    String name; // Reference + instance - heap
    String city; // Ref + instance - heap
    double gpa; // prim + instance - heap
    static String org = "C-DAC Hyd"; // Ref + class - Class / Method

	// methods - setters and getters
    void setStudent(int rno, String n, String c, double g){ // local 
    	rollNo = rno;
    	name = n;
    	city = c;
    	gpa = g;
    }
    void getStudent(){
    	System.out.println(rollNo+" "+name+" "+city+" "+gpa+" "+org);
    }
    
    public static void main(String[] args) {
    	
    	Student s1 = new Student(); // s1 -Ref + local
    	s1.setStudent(111,"ABC","Hyd",7.9);
    	s1.getStudent();
    	System.out.println(s1.toString()); // hashcode
    	System.out.println(s1.hashCode());

    	Student s2 = new Student();
    	s2.setStudent(123,"XYZ","Blr",8.1);
    	s2.getStudent(); //
    	System.out.println(s2.toString()); // hashcode
    	System.out.println(s2.hashCode());
    }
}