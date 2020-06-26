package Day9;

public class Uncheched_Exception {

	public static void main(String[] args) {
		

		System.out.println("Program started");
		
		int a=100;
		
		try
		{
			System.out.println(a/0);
		}
		catch(Exception e)    // ArithmeticException
		{
			System.out.println("Entered into catch block");	
		}
		finally   // optional    --- using for closing block
		{
			System.out.println("Entered into finally block");
		}
		System.out.println("Program exited");
	}

}
