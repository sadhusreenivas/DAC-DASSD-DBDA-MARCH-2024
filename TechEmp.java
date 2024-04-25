public class TechEmp extends Employee{
	// all non private member are available for use - 2 
	// Constructors are not inherited
	private int bonus; 
	
   public TechEmp(int eid, String ename, double basicPay, int bonus){
   //this.bonus = bonus;
   super(eid, ename, basicPay); // 
   this.bonus = bonus;
   }

	// redefine the calSalary() of Employee - to add bonus to the salary
	@Override
     public void calSalary(){
		// DA = 50, HRA = 24, CA = 6
		double da = 0.5;
		double hra = 0.24;
		double ca = 0.06;
	    double salary = basicPay + basicPay * da + basicPay * hra+ basicPay * ca + bonus;
        System.out.println("Salary: "+salary);
	}
    // to print bonus as well
    @Override
    public void getEmployee(){
    	super.getEmployee();  // parents method
		System.out.println(bonus);
	}
 
}