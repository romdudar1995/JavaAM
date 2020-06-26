package Day5;

public class Employee_Main {

	public static void main(String args[])
	{
		Employee emp1=new Employee();    // creating object
		emp1.eid=101;
		emp1.ename="David";
		emp1.sal=25000.00;
		emp1.deptno=10;
		emp1.job="Manager";
		emp1.display();
		
		
		Employee emp2=new Employee();
		emp2.eid=101;
		emp2.ename="Jonh";
		emp2.sal=25000.00;
		emp2.deptno=10;
		emp2.job="CEO";
		emp2.display();
		
	}

}
