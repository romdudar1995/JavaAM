package Day4;

import java.lang.reflect.Array;

public class Two_Multi_Dimensional_Array {

	public static void main(String[] args) {
		
		
		int a[][]=new int[3][2];	// 3-rows, 2-columns 

  /*    a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][2]=600;
		a[3][0]=700;
		a[3][3]=800;        */
		 
	
		
		int b[][]= {{100,200},{300,400},{500,600},{700,800}};
		
	 
		System.out.println("Number of rows - "+ b.length);  
		System.out.println("Number of columns - "+ b[0].length);  
		
		for(int i=0;i<b.length;i++)         // outer loop 
		{
		for(int g=0;g<b[i].length;g++)      // inner loop 
		{
		System.out.println(b[i][g]);	    // 
		}
		}
		
		
		
		
		
	}

}
