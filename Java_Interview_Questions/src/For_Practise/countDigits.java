package For_Practise;

import java.util.Scanner;

public class countDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		// for integer-----------
//		System.out.print("Enter the number: ");
//		long integer = scanner.nextLong();
//		int count = 0;
//		while (integer != 0) {
//			integer = integer / 10;
//			count++;
//		}
//		System.out.println("Number of digits : " + count);

		// for length method-------
		System.out.println("enter the string value");
		String string = scanner.nextLine();
		int count1 = 0;
		if (string.isEmpty()) {
			count1 = 0;
		} else {
			for (int i = 0; i <= string.length(); i++) {
				count1++;
			}
		}
		System.out.println("Number of characters: " + count1);

		// for char array method----------
		System.out.println("enter the string value");
		String str = scanner.nextLine();
		int count2 = 0;
		for (char ch : str.toCharArray()) {
			count2++;
		}
		System.out.println("Number of characters: " + count2);
	}

}
