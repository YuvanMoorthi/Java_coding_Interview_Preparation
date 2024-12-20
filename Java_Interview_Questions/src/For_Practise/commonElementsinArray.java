package For_Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class commonElementsinArray {

	public static void main(String[] args) {
		int[] a = { 2, 4, 7, 8, 3 };
		int[] b = { 3, 5, 7, 9, 1, 8 };
		List<Integer> commonElements = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					commonElements.add(a[i]);
				}
			}
		}
		System.out.println("Common Elements for given two array List is:" + commonElements);

		// array list

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int num : a) {
			list1.add(num);
		}
		for (int num : b) {
			list2.add(num);
		}
		list1.retainAll(list2);
		System.out.println("Common Elements:" + list1);

		String[] name1 = { "java", "c++", "python", "javascript" };
		String[] name2 = { "java", "python" };
		ArrayList<String> arraylist1 = new ArrayList<>(Arrays.asList(name1));
		ArrayList<String> arraylist2 = new ArrayList<>(Arrays.asList(name2));
		List<String> collect = arraylist1.stream().filter(arraylist2::contains).collect(Collectors.toList());
		System.out.println(collect);
	}

}
