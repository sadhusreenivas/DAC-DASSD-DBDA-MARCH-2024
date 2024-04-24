public class Course{
	private int courseID;
	private String courseName;
	private double courseFee;
    private static String institute = "C-DAC Hyderabad";

    // eliminate the need of setter
    public Course(int courseID, String courseName, double courseFee){
    	this.courseID = courseID;
    	this.courseName = courseName;
    	this.courseFee = courseFee;
    }

   // eliminate the need of getter
    // redefining - override
    @Override
    public String toString(){
    	return courseID+"\n"+courseName+"\n"+courseFee+"\n"+institute;
    }

    
    public static void main(String[] args) {
    	Course c1 = new Course(20,"PG-DAC",90000);
    	System.out.println(c1); // c1.toString();
    }

}