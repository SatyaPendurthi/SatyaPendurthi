package myproject1;
class Student
{
	int rollNum;
	String studName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;
	void setStudDetails(int rollNum, String studName, int mark1, int mark2, int mark3)
	{
		this.rollNum = rollNum;
		this.studName = studName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	void calculateTotal()
	{
		this.totalMarks = mark1+mark2+mark3;
	}
	void displayStudDetails()
	{
		System.out.println("Roll Number = "+rollNum);
		System.out.println("Student Name = "+studName);
		System.out.println("Total Marks = "+totalMarks);
	}
}
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudDetails(457, "ram", 24, 23, 25);
		s1.calculateTotal();
		s1.displayStudDetails();
	}
}
