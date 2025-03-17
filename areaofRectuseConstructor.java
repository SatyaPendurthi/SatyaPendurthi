/*Write a program to create a class Rectangle with datamembers length and breadth.
Create a method area() which finds the area of the rectangle. Use constructors to assign
values to datamembers*/

package myproject1;
class rectangle
{
	int length;
	int breath;
	int area;
	void area(int length,int breath)
	{
		area = length*breath;
	}
	void displayArea()
	{
		System.out.println("Area of Rectangle= "+area);
	}
}
public class areaofRectuseConstructor {

	public static void main(String[] args) 
	{
		rectangle r= new rectangle();
		r.area(1,4);
		r.displayArea();
	}

}
