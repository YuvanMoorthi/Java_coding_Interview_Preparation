package For_Practise;

import java.util.HashSet;

public class removeDuplicateFFromArray {

	public static void main(String[] args) {
		// using for loop
		String[] strArray = { "abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr" };
		for (int i = 0; i < strArray.length - 1; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i] == strArray[j]) {
					System.out.println("Brute Force Method : Duplicate Element is : " + strArray[j]);
				}
			}

		}
		HashSet<String> hashset = new HashSet<String>();
		for (String string : strArray) {
			if (!hashset.add(string)) {
				{
					System.out.println("HashSet :Duplicate Element is : " + string);
				}
			}
		}
	}
}