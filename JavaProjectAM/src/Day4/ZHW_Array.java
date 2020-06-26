package Day4;

public class ZHW_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {35,24,64,42,64};
		int sum = a[0]+a[1]+a[2]+a[3]+a[4];
		
		System.out.println(sum);

		
	
		
        int []num= {14,15,16,17};
		
		if(num[0]%2 == 0)                               
		{
		System.out.println("1st is even number");	
		}
		else
		{
		System.out.println("1st is odd number");	
		}
		if(num[1]%2 == 0)                                  
		{
		System.out.println("2nd is even number");	
		}
		else
		{
		System.out.println("2nd is odd number");	
		}
			
		
		
		int t[]= {2,7,7};
		
		if(t[0]>t[1] && t[0]>t[2])
		{
			System.out.println("First value is the greatest in array");
		} else if(t[1]>t[0] && t[1]>t[2])
		{
			System.out.println("Second value is the greatest in array");
		} else if(t[2]>t[1] && t[2]>t[0])
		{
			System.out.println("Third value is the greatest in array");
		} else 
		{
			System.out.println("There are two or more equals vlues");
			}
		
	}

}
