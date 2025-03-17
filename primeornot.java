package myproject1;
import java.util.Scanner;
public class primeornot {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		for(int i=1; i>=1; i--)
			if (n%i == 0)
			{
				System.out.println("number is prime");
			}
			else
			{
				System.out.println("number is not prime");
			}
			
	}

}