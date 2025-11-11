import java.util.*;
public class Student1
{
	int roll_no;
	String name;
	void insert_detail(int r , String n)
	{
		roll_no=r;
		name=n;
	}
	void display_detail()
	{
		System.out.println("---STUDENT DETAIL---");
		System.out.println("Roll number : "+roll_no);
		System.out.println("Student Name : "+name);
	}
public static void main(String args [])
{
	Student1 obj = new Student1();
	obj.insert_detail(46,"Shubham");
	obj.display_detail();
}
}
