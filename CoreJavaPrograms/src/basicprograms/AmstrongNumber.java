package basicprograms;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		int result = amstrongNumber(num);

		if (num == result) {
			System.out.println("Amstrong Number");
		} else {
			System.out.println("Not Amstrong Number");
		}

	}

	public static int amstrongNumber(int num) {
		int remainder = 0, result = 0;

		while (num > 0) {
			remainder = num % 10;
			result = (remainder * remainder * remainder) + result;
			num = num / 10;
		}
		System.out.println(result);
		return result;
	}

}
