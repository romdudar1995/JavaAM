package Day7;


	class Teacher
	{
		String designation = "Teacher";
		String colleageName = "Begginersbook";
		
		void does()
		{
			System.out.println("Teaching");
		}
	}
	
	
	
	class ComputerTeacher extends Teacher
	{
		
	}




public class ZHW_Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComputerTeacher ct=new ComputerTeacher();
		System.out.println(ct.designation);
		System.out.println(ct.colleageName);
		ct.does();

	}

}
