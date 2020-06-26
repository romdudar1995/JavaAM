package Day8;


	interface A12
	{
		int a=5; 
	    int b=10;
		void add();
	}

	interface A22
	{
		int x=7; 
	    int y=17;
		void mul();
	}

	
	
	

public class ZHW_day82 implements A12,A22
{
	public void add() 
	{
		System.out.println(a+b);
	}
	public void mul() 
	{
		System.out.println(x*y);
	}

	public static void main(String[] args) {
		
		ZHW_day82 am=new ZHW_day82();
		am.add();
		am.mul();
		
	}

}
