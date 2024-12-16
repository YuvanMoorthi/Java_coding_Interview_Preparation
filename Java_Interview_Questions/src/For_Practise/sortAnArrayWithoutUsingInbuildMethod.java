package For_Practise;

import java.util.Arrays;

public class sortAnArrayWithoutUsingInbuildMethod {

	public static void main(String[] args) {
		int temp, size;
		int array[] = { 10, 5, 20, 63, 12, 57, 98, 88, 60, 78 };
		size = array.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " , ");
		}
		System.out.println("Third largest number in this array:=> " + array[size - 3]);

		// sort in build method
		Arrays.sort(array);
		System.out.println("sorted array- " + Arrays.toString(array));
	}

}