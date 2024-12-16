package For_Practise;

public class fibonacciSeries {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1, count = 10;
		System.out.print("Fibonacci series of " + count + " =>  ");
		for (int i = 0; i <= count; i++) {
			System.out.print(num1 + "");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}

	}

}
