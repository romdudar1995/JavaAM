package Day4;

public class String_Methods {

	public static void main(String[] args) {

		String s = "Welcome";
		System.out.println(s.length());	  //length of string
		
		
		String s1 = "Welcome ";
		String s2 = "To Java";
		System.out.println(s1.concat(s2));	 //joining of string
		
		
		String b="Roman";
		System.out.println(b.charAt(4));   //  index will start from 0

		
		String c="Dudar";
		System.out.println(c.contains("uda")); 
		System.out.println(c.contains("dud"));//  contains method
	
	
	
	
		s="Welcome to Java";
		
		System.out.println(s.replace("a", "i"));
	
	}

}
