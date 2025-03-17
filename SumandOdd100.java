package myproject1;
public class SumandOdd100 
{
	public static void main(String[] args) 
	{
		int i=1, SumEven=0, SumOdd=0;
		while(i <= 100)
		{
			if(i % 2 == 0)
			{ 
				SumEven = SumEven + i;
			}
			else
			{
				SumOdd = SumOdd + i;
			}
		i++;
		}
				System.out.println("Sum of Even numbers " +SumEven);
				System.out.println("Sum of Odd numbers " +SumOdd);
	}

}
