package For_Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class largestNumberfromGivenList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println("enter the value of how many number you enter");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("enter the number you want to verify");
			int num = scanner.nextInt();
			arrayList.add(num);
		}
		Integer max = Collections.max(arrayList);
		System.out.println("largest number of the given list is: " + max);
		scanner.close();
	}

}
