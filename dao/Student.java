package dao;

public class Student 
{
	private int rollno;
	private String name;
	public Student(int rollno, String name) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	

}
