public class CMDDemo1{

	public static void main(String[] args) {
		
		double radius = Double.parseDouble(args[0]);
		double area = 3.14 * radius* radius;
		System.out.println("Area of a circle of "+radius+" is: "+area);

	}
}
