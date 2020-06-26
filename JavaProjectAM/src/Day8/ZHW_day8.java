package Day8;


	interface AHW
	{
		int a=5;
		int b=10;
		void sum();
		
	}




public class ZHW_day8 implements AHW
{
	public void sum() 
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
	
		ZHW_day8 rd=new ZHW_day8();
		rd.sum();

	}

}
