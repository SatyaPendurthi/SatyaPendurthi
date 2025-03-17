package collections;
import java.util.Scanner;
import java.util.*;
public class linkedlist 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add("Ram");
		l.add("Shiva");
		l.add(50);
		System.out.println(l);
		while (true) 
		{
	        System.out.println("1. Add Element at last");
	        System.out.println("2. Add Element at First");
	       /* System.out.println("3. Add Element at given Index");
	        System.out.println("4. update elemnt at given index");
	        System.out.println("5. Delete the first Element");
	        System.out.println("6. Delete the last Element");
	        System.out.println("7. Delete the given Element");
	        System.out.println("8. Delete the element at Given Index");
	        System.out.println("9. Display the elements");*/
	        System.out.println("10. Exit");
	        System.out.print("Choose an option: ");
	        int ch = s.nextInt();
			switch(ch)
			{
				case 1: l.addLast(s);
						System.out.println(l);
						break;
				case 2:	l.addFirst(s);
						System.out.println(l);
						break;
				
				default : System.out.println("Please Enter Valid Number");
		
			}
		}

		
	}
}
