package For_Practise;

public class reverseEachWordInSentence {

	public static void main(String[] args) {
		String str = "reverse each word in a string";
		String[] word = str.split("\\s");
		String reverseWord = "";
		for (String string : word) {
			StringBuilder sb = new StringBuilder(string);
			sb.reverse();
			reverseWord = reverseWord + sb.toString() + " ";
		}
		System.out.println(reverseWord.trim());
	}

}
