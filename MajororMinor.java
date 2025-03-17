package myproject1;
import java.util.Scanner;
public class MajororMinor 
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Age");
		int Age = s.nextInt();
		if (Age>=18)
				System.out.println("Major");
		else
				System.out.println("Minor");
			if (Age<0)
				System.out.println("Invalid Age");
	}

}
