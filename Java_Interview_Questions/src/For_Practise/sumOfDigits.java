package For_Practise;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scanner.nextInt();
		int sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("the sum of the value is:=> " + sum);
	}

}
