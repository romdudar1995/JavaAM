package Day6;

public class Constructor_Overloading {

	
	Constructor_Overloading(int a, int b)   // 1
	{
		System.out.println(a+b);
	}
	Constructor_Overloading(int a, double b)   // 2
	{
		System.out.println(a+b);
	}
	Constructor_Overloading(double a, int b)   // 3
	{
		System.out.println(a+b);
	}
	Constructor_Overloading(int a, int b, int c)   // 4
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		
		
		Constructor_Overloading co=new Constructor_Overloading(10.5, 20);   // 3
		Constructor_Overloading co1=new Constructor_Overloading(10, 20);    // 1
	

	}

}
