package For_Practise;

import java.util.Scanner;

public class palindrome {
	public static boolean isPalindrome(String str, int left, int right) {
		// Base case: if pointers have crossed, it's a palindrome
		if (left >= right) {
			return true;
		}
		// Check if characters at 'left' and 'right' are not the same
		if (str.charAt(left) != str.charAt(right)) {
			return false;
		}
		// Recursive call: move the pointers inward
		return isPalindrome(str, left + 1, right - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Recursion ------------

		// Step 1: Take input from the user
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();

		// Step 2: Call the recursive function
		if (isPalindrome(str, 0, str.length() - 1)) {
			System.out.println(str + " is a Palindrome.");
		} else {
			System.out.println(str + " is not a Palindrome.");
		}

		// Reversal method for string -------------

		// Step 1: Take input from the user
		System.out.print("Enter a string: ");
		String str1 = scanner.nextLine();

		// Step 2: Reverse the string
		String reversedStr = new StringBuilder(str1).reverse().toString();

		// Step 3: Check if the original string is equal to the reversed string
		if (str1.equals(reversedStr)) {
			System.out.println(str1 + " is a Palindrome.");
		} else {
			System.out.println(str1 + " is not a Palindrome.");
		}

		scanner.close();

		// while loop for integer----------
		int num = 12321;
		int finalNum = num;
		int reverse = 0;
		while (num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reversed Number is " + reverse);

		if (finalNum == reverse)
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is NOT a Palindrome");
	}

}
