
public class Student{
	// data 
	int rollNo;
    String name;
    String city;
    double gpa;
	// methods - setters and getters
    void setStudent(int rno, String n, String c, double g){
    	rollNo = rno;
    	name = n;
    	city = c;
    	gpa = g;
    }

    void getStudent(){
    	System.out.println(rollNo+" "+name+" "+city+" "+gpa);
    }
    
}