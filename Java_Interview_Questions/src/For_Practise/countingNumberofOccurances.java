package For_Practise;

public class countingNumberofOccurances {

	public static void main(String[] args) {
		String string = "Java is a programming language. Java is widely used in software Testing";
		String[] words = string.toLowerCase().split(" ");
		String word = "java";
		int occurance = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word)) {
				occurance++;
			}
		}
		System.out.println(occurance);

	}

}