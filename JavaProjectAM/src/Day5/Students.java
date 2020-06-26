package Day5;

public class Students {

	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	
	
	
	 void getStuData() 
	{
	   System.out.println(SID);
	   System.out.println(Sname);
	}
	 
	void getStuMarks()
	{
	   System.out.println(Sub1);
	   System.out.println(Sub2);
	   System.out.println(Sub3);
	}
	void totalMarks()
	{
	   int total;
	   total = Sub1+Sub2+Sub3;
	   System.out.println(total);
	}
	void avgMarks()
	{
		int avg;
		int total;
		total = Sub1+Sub2+Sub3;
		avg=(total)/3;
		System.out.println(avg);
	}
	
	public static void main(String[] args) {
	

		Students st1 = new Students();
		
		st1.SID=101;
		st1.Sname="Tom";
		st1.Sub1=71;
		st1.Sub2=72;
		st1.Sub3=73;
		st1.getStuData();
        st1.getStuMarks();	
        st1.totalMarks();
        st1.avgMarks();
        
        
        Students st2 = new Students();
		
		st2.SID=102;
		st2.Sname="Tim";
		st2.Sub1=75;
		st2.Sub2=73;
		st2.Sub3=79;
		st2.getStuData();
        st2.getStuMarks();	
        st2.totalMarks();
        st2.avgMarks();
		
		
	}

}
