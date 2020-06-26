package Day5;

public class Calculation {

	
	int x=10;
	int y=20;
	

/*	void sum()    // case 1 - not taking any parameters and also not returning any value
	{
		System.out.println(x+y);
	}	*/
	
/*	int sum()    // case 2 - not taking any parameters but returning value
	{
		return(x+y);
	}	*/
/*	void sum(int a, int b)    // case 3 - taking parameters but not returning any value
	{
		System.out.println(a+b);
	}  */
	int sum(int a, int b)    // case 4 - taking parameters and also returning a value
	{
		return(a+b);
	}
	
	
	
	
	  public static void main(String[] args) {
	
      Calculation cal=new Calculation();
  //  cal.sum();    // case 1
      
/*    int res=cal.sum();  // case 2 
      System.out.println(res);  */
      
 //   cal.sum(100, 200);     // case 3
      
      System.out.println(cal.sum(100, 200));   // case 4
	}

}
