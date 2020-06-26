package Day6;

public class Static_Example {

	
	static int a=10;  // static variable
	int b=20;    // non-static variable
	
	
	static void m1()
	{
		System.out.println("This is static nethod");
	}	
	void m2()
	{
		System.out.println("This is non-static nethod");
	}	
	
	void m3()
	{
		System.out.println("This is m3 Non-static method");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	
	
	public static void main(String[] args) {
		
        // static methods can access only static stuff
		System.out.println(a);
		m1();
		
		// static methods can access non-static stuff but through object.
		Static_Example se=new Static_Example();
		System.out.println(se.b);
		se.m2();
		se.m3();
	}

}
