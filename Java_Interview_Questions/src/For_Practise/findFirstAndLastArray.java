package For_Practise;

import java.util.ArrayList;
import java.util.Arrays;

public class findFirstAndLastArray {

	public static void main(String[] args) {
		int[] input = { 3, 4, 5, 6, 7, 8 };
		Integer[] inputwrapper = Arrays.stream(input).boxed().toArray(Integer[]::new);
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(inputwrapper));
		int first = list.getFirst();
		int last = list.getLast();
		System.out.println(first + "  " + last);
	}

}
