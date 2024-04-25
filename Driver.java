
public class Driver{
	
public static void main(String[] args) {
	
	 Employee e = new Employee(321,"ABC", 100000);
	 TechEmp te = new TechEmp(123,"ASDF",100000,10000);

	 e = te; // upcasting

	 e.getEmployee(); // overriden method
	 e.calSalary(); // overriden method



	}

}