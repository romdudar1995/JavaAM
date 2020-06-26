package Day7;

public class Final_Variable {

	
		final int speed=40;   // final variable, we can not change this value
	
	
	
	public static void main(String[] args) {
		
		Final_Variable fm=new Final_Variable();
		fm.speed=100;   /compile time eroor
		System.out.println(fm.speed);
	}

}
