package Day6;

public class ZHW_Calculation {

	
	void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	void sum(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
	void sum(double x, double y)
	{
		System.out.println(x+y);
	}
	void sum(double x, double y, double z)
	{
		System.out.println(x+y+z);
	}
	
	
	
	
	public static void main(String[] args) {
		
		ZHW_Calculation cal=new ZHW_Calculation();
		cal.sum(1, 2);
		cal.sum(1, 2, 3);
		cal.sum(1.5, 2.5);
		cal.sum(1.5, 2.5, 3.5);

	}

}
