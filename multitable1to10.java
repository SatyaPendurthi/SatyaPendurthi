package myproject1;

public class multitable1to10 {

	public static void main(String[] args) {
		int p=0, n;
		for(int i=1; i<=10; i++)
		{
			for(n=1; n<=10; n++)
			{
				p = i*n;
				System.out.println( n+ " * "+i+" = "+p);
			}
			System.out.println();
		}
		
	}
		
}
