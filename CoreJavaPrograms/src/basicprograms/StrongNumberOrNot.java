package basicprograms;

import java.util.Scanner;

public class StrongNumberOrNot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		int result = strongNumber(num);

		if (result == num) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not Strong Number");
		}
	}

	public static int strongNumber(int num) {
		int result, sum = 0;
		while (num > 0) {
			int remainder = 0;
			remainder = num % 10;
			result = 1;

			for (int i = remainder; i > 0; i--) {
				result = (result * i);
			}
			num = num / 10;
			sum += result;

		}
		return sum;
	}

}
