interface NewFeaturesDemo{
int MAX_MARKS = 40;
void fun();
default void disp(){
	System.out.println(MAX_MARKS); // 40
	test();
}
static void msg(){
	System.out.println(MAX_MARKS);
	method();
}
private void test(){
	System.out.println("I am a private method!");
}

private static void method(){
	System.out.println("private static method!");
}
}

public class NewDemo implements NewFeaturesDemo{
	public void fun(){
		System.out.println("Fun generated!");
	}
	public static void main(String[] args) {
		NewDemo obj = new NewDemo();
		obj.fun();
		obj.disp();	// default
        NewFeaturesDemo.msg(); //
        

	}
}