package For_Practise;

import java.util.Scanner;

public class swapTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		// this is for three variable
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping, a = " + a + " and b = " + b);

		// this is for two variable
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping, a = " + a + " and b = " + b);

		// swapping with XOR
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping, a = " + a + " and b = " + b);
		scanner.close();
	}

}
