package Day3;

public class Do_While_Loop {

	public static void main(String[] args) {
		
		// In first round never checked the condition, directly jumping in the block 
		
		
	    int i=1;
		do
		{
		System.out.println(i);  // 1 2 3 4 5 6 7 8 9 10
		i++;
		} 
		while(i<=10);

	   	System.out.println("---------------------------------");
		
		 int r=20;	
		 do
		 {
		 System.out.println(r);  // 20
		 r++;
		 }
		 while(r<=10);
	}

}
