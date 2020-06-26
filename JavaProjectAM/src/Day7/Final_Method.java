package Day7;

	final class Bike       // final class, so we cannot extend into child class
	{
		final void run()   // final method, so we cannot override this method
		{
			System.out.println("Running....");
		}
	}

    class Honda extends Bike   // compile time error
    {
    	void run()   // compile time error
		{
			System.out.println("Started....");
		}
    }

public class Final_Method {

	public static void main(String[] args) {
	

	}

}
