package dao;

public class Daomain {

	public static void main(String[] args) 
	{
		Studentdaoimpl d = new Studentdaoimpl();
		
		for(Student s : d.getallstudents())
		{
			System.out.println("Roll no. : "+s.getRollno());
			System.out.println("Name :" +s.getName());
		}

	}

}
