import java.util.*;
public class Student2
{
	int roll_no;
	String name;
	Student2(int r , String n)
	{
		this.roll_no=r;
		this.name=n;
	}
	void display_detail()
	{
		System.out.println("---STUDENT DETAIL---");
		System.out.println("Roll number : "+this.roll_no);
		System.out.println("Student Name : "+this.name);
	}
public static void main(String args [])
{
	Student2 obj = new Student2(46,"Shubham");
	obj.display_detail();
}
}
