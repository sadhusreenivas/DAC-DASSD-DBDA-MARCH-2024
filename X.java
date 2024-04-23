class X{
	
	void msg(){
		System.out.println(this); //
	}

	public static void main(String[] args) {
		X x1 = new X();
		x1.msg();
		System.out.println(x1);
	}
}