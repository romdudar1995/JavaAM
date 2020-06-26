package Day7;


        								// Multilevel_Inheritance

        class A
        {
    	int a;
    	void display()
    	{
    		System.out.println(a);
    	}
        }

        class B extends A        // B is child class, A is parent class
        {
        	int b;
        	void print()
        	{
        		System.out.println(b);
        	}

        }
        
        class C extends B        // C is child class, B is parent class
        {
        	int c;
        	void show()
        	{
        		System.out.println(c);
        	}

        }

        public class Multilevel_Inheritance {

        	public static void main(String[] args) {


        		A aobj=new A();
        		aobj.a=100;
        		aobj.display();


        		B bobj=new B();
        		bobj.a=10;           // belongs to A
        		bobj.b=20;           // belongs to B

        		bobj.display();      // belongs to A
        		bobj.print();        // belongs to B
        		
        		
        	    C cobj=new C();     
        	    cobj.a=10;           // belongs to A       	                          
        	    cobj.b=20;           // belongs to B   
         	    cobj.c=30;           // belongs to C   
        	    
        	    cobj.display();      // belongs to A    
        	    cobj.print();        // belongs to B 
        	    cobj.show();         // belongs to C    
        	}

        }
		
		
	