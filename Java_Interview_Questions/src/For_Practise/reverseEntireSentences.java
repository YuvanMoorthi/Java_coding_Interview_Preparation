package For_Practise;

public class reverseEntireSentences {

	public static void main(String[] args) {
		/**
		 * @Input = "India is country My"
		 * @Output = "My country is India"
		 */
		String str[] = "India is country My".split(" ");
		String ans = "";
		for (int i = str.length - 1; i >= 0; i--) {
			ans = ans + str[i] + " ";
		}
		System.out.println(ans);
	}

}
