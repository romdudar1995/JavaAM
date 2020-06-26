package Day6;

public class Method_Overloading {

	
	void add(int a, int b)   // 1
	{
		System.out.println(a+b);
	}
	void add(int a, double b)   // 2
	{
		System.out.println(a+b);
	}
	void add(double a, double b)   // 3
	{
		System.out.println(a+b);
	}
	void add(int a, int b, int c)  // 4
	{
		System.out.println(a+b+c);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Method_Overloading mo=new Method_Overloading();
        mo.add(10, 20);       // 1
        mo.add(10, 20, 30);   // 4
        mo.add(10, 20.5);     // 2
        mo.add(10.5, 10.0);   // 3
	}

}
