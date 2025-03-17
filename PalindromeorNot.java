package myproject1;
import java.util.Scanner;
public class PalindromeorNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a string:");
		        String input = scanner.nextLine().toLowerCase();

		        if (isPalindrome(input)) {
		            System.out.println("The given string is a palindrome.");
		        } else {
		            System.out.println("The given string is NOT a palindrome.");
		        }

		    }

		    public static boolean isPalindrome(String str) {
		        int left = 0, right = str.length() - 1;
		        
		        while (left < right) {
		            if (str.charAt(left) != str.charAt(right)) {
		                return false;
		            }
		            left++;
		            right--;
		        }
		        return true;
		    }
		}
