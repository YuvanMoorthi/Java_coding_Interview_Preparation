package For_Practise;

public class reverseAString {

	public static void main(String[] args) {
		// length method--------
		String name = "mama";
		String name1 = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			name1 = name1 + name.charAt(i);
		}
		System.out.println("Reversed word: " + name1);
		// to check palindrome------
		if (name.equalsIgnoreCase(name1)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
		// string builder---------
		String input = "Welcome To Jave Learning";
		StringBuilder input1 = new StringBuilder();
		input1.append(input); // append a string into StringBuilder input1
		input1.reverse();
		System.out.println(input1);
		// string buffer---------
		String strText = "Java Learning";
		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(strText);
		sbr.reverse();
		System.out.println(sbr);

	}
}
