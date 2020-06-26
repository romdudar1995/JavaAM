package Day4;

public class Single_Dimensional_Array {

	public static void main(String[] args) {
		
		// Array is collection of elements of same data type.

		
/*	    int a[]=new int[5];  // declared array with size 5, starting index is 0, last index is 4
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;                  */
		
		
		int a[]= {100,200,300,400,500};  // declared array without specifying size
		
		System.out.println("Length of array is: "+a.length);    // print leght.size of an array
		
		System.out.println(a[2]);
		
	
		                    
		for(int i:a)    // Enhanced for loop
		{
			System.out.println(i);  //100  200  300  400  500
		}
		
	}

}
