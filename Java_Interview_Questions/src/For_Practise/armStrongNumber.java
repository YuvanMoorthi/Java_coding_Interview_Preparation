package For_Practise;

public class armStrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int temp = num, sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += digit * digit * digit;
			num /= 10;
		}
		if (sum == temp)
			System.out.println(temp + " is an Armstrong number");
		else
			System.out.println(temp + " is NOT an Armstrong number");
	}
}