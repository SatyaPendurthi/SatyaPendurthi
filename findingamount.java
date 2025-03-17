package myproject1;
import java.util.Scanner;
public class findingamount
{
	public static void main(String[] arg) 
	{
		Scanner s = new Scanner (System. in);
		System.out.println ("Enter item number");
		int number = s.nextInt();
		System.out.println("Enter name");
		String name = s.next();
		System.out.println("Enter item rate");
		int rate = s.nextInt();
		System.out.println ("Enter item quantity");
		int quantity = s.nextInt();
		int amount = rate*quantity ;
		System.out.println(" amount = "+amount);
	}
}
