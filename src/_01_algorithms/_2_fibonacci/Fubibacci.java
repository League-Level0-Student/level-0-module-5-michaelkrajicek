package _01_algorithms._2_fibonacci;

public class Fubibacci {
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;
		int sum = number1 + number2;
		System.out.println(number1);
		System.out.println(number2);

		for(int i = 0; i <12; i++) {
			System.out.println(sum);
			number1 = number2;
			number2 = sum;
			sum = number1 + number2;
		}

	}
}
