package myproject1;
import java.util.Scanner;
public class countcharintext {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter text");
		String s1=s.nextLine().toLowerCase();
		int length=0,countvowel=0,countconsonant=0;
		char ch;
		length = s1.length();
		for(int i=0; i<length;i++)
		{
		ch = s1.charAt(i);
		if (Character.isAlphabetic(ch))
		{
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':countvowel++;
					 break;
			default: countconsonant++; 
			}
		}
		//System.out.println("Enter a valid text");
		}
		System.out.println("vowel count = "+countvowel);
		System.out.println("Consonant Count = "+countconsonant);
	}

}
