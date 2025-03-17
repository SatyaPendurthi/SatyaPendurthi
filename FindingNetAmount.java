package myproject1;
import java.util.Scanner;
public class FindingNetAmount
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
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
		if (amount >= 1000 && amount < 2000)
		{
			double Discount = 0.10 * amount;
			double Netamount = amount - Discount;
			System.out.println ("Discount 10% and Net amount is " +Netamount);
		}
		else
			if (amount >= 2000 && amount < 3000)
			{
				double Discount2 = 0.15 * amount;
				double Netamount2 = amount - Discount2;
				System.out.println ("Discount 15% and Net amount is " +Netamount2);
			}
			else 
				if (amount >= 3000 && amount < 5000)
				{	
					double Discount3 = 0.20 * amount;
					double Netamount3 = amount - Discount3;
					System.out.println ("Discount 20% and Net amount is  " +Netamount3);
					
				}
				else
					if (amount > 5000)
					{
						double Discount4 = 0.25 * amount;
						double Netamount4 = amount - Discount4;
						System.out.println ("Discount 25% and Net amount is  " +Netamount4);
					}
	}
}
