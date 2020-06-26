package Day3;

public class Jumping_Statements {

	public static void main(String[] args) {
	

		for(int i=1; i<=10; i++)
		{
			if (i==5)
			{
				break;
			}
			System.out.println(i);  // 1 2 3 4		
		
	}
		System.out.println("-----------------------------------");

		for(int a=1; a<=10; a++)
		{
			if (a==5)
			{
				continue;
			}
			System.out.println(a);  // 1 2 3 4  6 7 8 9 10		
		
	}
		System.out.println("-----------------------------------");

		for(int b=1; b<=10; b++)
		{
			if (b==3)       // or if(i==3 || i==5 || i==7)
			{
				continue;
			} else if (b==5) 
			{
				continue;
			} else if (b==7) 
			{
				continue;
			}
			
			System.out.println(b);  // 1 2   4   6    8 9 10		
		
	}
}
}