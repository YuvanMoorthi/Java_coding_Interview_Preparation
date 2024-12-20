package For_Practise;

import java.util.HashMap;
import java.util.Map;

public class countTheOccurancesInEachCharacter {

	public static void main(String[] args) {
		/**
		 * @Input = "This is an example";
		 * @Output = p = 1, a = 2, s = 2, T = 1, e = 2, h = 1, x = 1, i = 2, l = 1, m=
		 *         1, n = 1
		 */
		String str = "This is an example";
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		char arr[] = str.toCharArray();
		for (char c : arr) {
			if (c != ' ') {
				if (hashmap.containsKey(c)) {
					hashmap.put(c, hashmap.get(c) + 1);
				} else {
					hashmap.put(c, 1);
				}
			}
		}
		for (Map.Entry entry : hashmap.entrySet()) {
			System.out.print(entry.getKey() + " = " + entry.getValue() + ", ");
		}
	}

}
