package For_Practise;

import java.util.Arrays;

public class secondLargestAndSecndSmallest {

	public static void main(String[] args) {
		int[] arraylist = { 55, 76, 35, 89, 56, 26, 69, 97 };
		int num = arraylist.length;
		Arrays.sort(arraylist);
		System.out.println("Second Largest element is " + arraylist[num - 2]);
		System.out.println("Second Smallest element is " + arraylist[1]);
	}

}