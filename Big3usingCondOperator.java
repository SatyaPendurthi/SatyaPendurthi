package myproject1;
import java.util.Scanner;
public class Big3usingCondOperator 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System. in);
		System.out.println ( "Enter Any three numbers");
		int n1 = s. nextInt();
		int n2 = s. nextInt();
		int n3 = s. nextInt();
		int Big=(n1>n2) ? ((n1>n3) ? n1:n3) : ((n2>n3) ? n2:n3 );
		System.out.println(+Big);
	}

}
