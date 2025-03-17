package myproject1;
import java.util.Scanner;
public class BigSmallinArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[5];
		System.out.println("Enter five numbers for Array");
		int i=0,big=0,small=0;
		for ( i=0; i<n.length; i++)
			n[i]= s.nextInt();
		System.out.println("Enter key to Search");
		int key= s.nextInt();
		for(i=0; i<n.length;i++)
		{
			if(key<n[i])
			{
				big= n[i];
				System.out.println("big="+big);
			}
			small=n[i];
			System.out.println("small = "+small);
		}
	}
}
