package dao;

import java.util.*;

public class Studentdaoimpl implements Studentdao
{
     
	List<Student> stud;
	
	public Studentdaoimpl()
	{
		stud = new ArrayList<Student>();
		Student s1 = new Student(1,"jhon");
		Student s2 = new Student(2, "robert");
		stud.add(s1);
		stud.add(s2);
	}
	@Override
	public List<Student> getallstudents()
	{
		return stud;
	}

	@Override
	public Student getstudent(int rollno) {
		return null;
	}

	@Override
	public void deletestudent(Student stud) {
		
	}

	@Override
	public void updatestudent(Student stud) {
			
	}

}
