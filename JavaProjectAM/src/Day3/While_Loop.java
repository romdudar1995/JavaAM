package Day3;

public class While_Loop {

	public static void main(String[] args) {
		
		// IF WE DO NOT KNOW MAX LIMIT WE ARE GO FOR WHILE LOOP
		
    // Loop set of statement/s can be repeated multiple times based on a condition.

		// First check the condition and after jumping to the block
		
		int i=1;
		// 1 to 10 numbers
		while (i<=10)
		{
			System.out.println(i);  // i 
			i++;
		}                                      
		
		System.out.println("---------------------------------");
		
		int r=2;
		// 2 4 6 8 10
		while (r<=10)
		{
			System.out.println(r);  // i 
			r+=2;      	// r=r+2;
		}              
			
		System.out.println("---------------------------------");
		
		int n=10;
		// 10 9 8 7 6 5 4
		while(n>3)
		{
        System.out.println(n);
        n=n-1;
		}
		
		
	}

}
