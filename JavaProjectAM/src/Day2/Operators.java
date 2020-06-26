package Day2;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		//    1. Arithmetic operators   +   -   *   /   %
		
		System.out.println("Sum of a+b="+(a+b));   // 30
		System.out.println("Mul of a*b="+(a*b));   // 200
		
		
		
		//    2.Relational operators   ==   <   >   <=   >=   !=
		//    Always return boolean value
		
		System.out.println(a==b);   //false
		System.out.println(a>b);    //false
		
		
		//    3.Logical operators   &&   ||   ! 
		//    Works between two boolean
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);   //false
		System.out.println(x || y);   //true
		System.out.println(!x);       //false
		
		
		
		//   4.Increment/decrement operators ++   --
		
		a=10;
		a++;   // a=a+1=11
		System.out.println(a); 
		
		
		//   5.Assignment operators   =   
		
	}

}
