package Day7;

public class Animal {

	String color="white";
	
	void eating()
	{
		System.out.println("eating...");
	}
}

class Dog extends Animal
{
	String color="black";
	
	void displaycolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	
	void eating()
	{
		System.out.println("eating bread...");
		super.eating();
	}
}