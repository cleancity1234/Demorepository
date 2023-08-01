package dao;
import java.util.*;
public interface Studentdao 
{

	public List<Student> getallstudents();
	public Student getstudent(int rollno);
	public void deletestudent(Student stud);
	public void updatestudent(Student stud);
}
