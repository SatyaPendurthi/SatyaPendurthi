package myproject1;
import java.util.Scanner;
public class small10 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n, i=1, small=10;
		while(i<=10)
		{
			System.out.println("Enter a Number");
			n = s.nextInt();
			if (n < small)
				small = n;
			i++;
		}
			System.out.println("Small "+small);
	}

}
