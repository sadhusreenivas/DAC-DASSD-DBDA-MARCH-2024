public class Employee{
	private int eid;
	private String ename;
	protected double basicPay;
	private static String org = "C-DAC";

	public Employee(int eid, String ename, double basicPay){
		this.eid = eid;
		this.ename = ename;
		this.basicPay = basicPay;
	}
	public void getEmployee(){
		System.out.println(eid+" "+ename+" "+basicPay+" "+org);
	}
	public void calSalary(){
		// DA = 50, HRA = 24, CA = 6
		double da = 0.5;
		double hra = 0.24;
		double ca = 0.06;
	    double salary = basicPay + basicPay * da + basicPay * hra+ basicPay * ca;
        System.out.println("Salary: "+salary);
	}


}