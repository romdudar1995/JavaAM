package Day6;

public class This_Keyword {

	int a,b;   // instance variables or class variables
	
	void getValues(int a, int b)    // method variables
	{
		this.a=a;
		this.b=b;	
	}
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		 This_Keyword th=new  This_Keyword();
		 th.getValues(10, 20);
		 th.printValues();

	}

}
