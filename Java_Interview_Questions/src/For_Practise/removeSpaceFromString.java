package For_Practise;

import java.util.Scanner;

public class removeSpaceFromString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentences");
		String input = scanner.nextLine();
		input = input.replaceAll("\\s", "");
		System.out.println("Final String- " + input);
	}

}
