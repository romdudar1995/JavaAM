package Day3;

public class ZHW_d3 {

	public static void main(String[] args) {
	
		//1
		int i=-1;
		
		if (i>=0) 
		{
			System.out.println("Possitive value");
		} else 
		{
			System.out.println("Negative value");
	}
		//2
		int a=2, b=2, c=2;
		
		if (a>b && a>c) 
		{
			System.out.println("a is the greater value");
		} else if (b>a && b>c) {
			System.out.println("b is the greater value");
		} else if (c>a && c>b) {
			System.out.println("c is the greater value");
		} else 
		{
			System.out.println("There are two or three equals values");
		}

		//3
		for (int n=5,m=0;m<=10; m=m+1)
		{
			System.out.println(n+"X"+m+"="+n*m);
		}
		
		//4
		int a1=12345;
		int b1=Integer.toString(a1).length();
		System.out.println(b);
		
		
		String st1="12345";
		int length=st1.length();
		System.out.println("The length of st1 is: "+length);
		

		 


}
}