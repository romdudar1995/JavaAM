package Day5;

public class Calculations {

	int a;
	int b;
	int c;
	
	Calculations()
	{
		a=10;
		b=20;
		c=30;
	}

	
	void sum() 
	{
		int sum;
		sum = a+b+c;
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
		Calculations cons = new Calculations();
		
		cons.sum();
		

	}

}
