package Day10;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		
		// ArrayList list=new ArrayList();  // we can store any type of elements
    	// ArrayList <Integer> list=new ArrayList <Integer>();
		
		ArrayList <String> list=new ArrayList <String>();
		
		// Adding values to array list
		list.add("John");   // 0 index
		list.add("David");  // 1 index
		list.add("Scott");  // 2 index
		list.add("Smith");  // 3 index
		
		// Size of array list
		System.out.println(list.size());   // 4
		System.out.println(list);
		
		
		// Remove an element
		list.remove(2);  // remove Scott
		System.out.println(list);
		
		// Insert new element in the middle of array list
		list.add(1,"Scott2");
		System.out.println(list);
		
		// Read values from array list using for loop
		for(String s:list)
		{
			System.out.println(s);
		}
	}

}
