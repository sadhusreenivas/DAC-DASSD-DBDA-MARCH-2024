public class AISDemo{
	public static void main(String[] args) {
		
		Person p1 = new Person()
		{
			@Override
			public void eat(){
				System.out.println("Eating Curd Rice");
			}
			@Override
			public void speak(){
               System.out.println("Speaks English");
			}
		};
       
       p1.eat();
       p1.speak();

	}
}