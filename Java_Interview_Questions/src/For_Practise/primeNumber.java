package For_Practise;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.print("Enter the number:  ");
		int num = scanner.nextInt();
		int count = 0;
		if (num <= 1) {
			System.out.println("this " + num + " is not prime number");
			return;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count > 1) {
			System.out.println("The number is not prime");
		} else {
			System.out.println("The number is prime");
		}
	}

}