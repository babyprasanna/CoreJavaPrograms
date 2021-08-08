package basicprograms;

import java.util.Scanner;

public class IndividualNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		int number = individualNumber(num);
		{
			System.out.println(number);
		}
	}

	public static int individualNumber(int num) {
		int remainder = 0, result = 0;
		while (num > 9) {
			result = 0;
			while (num > 0)

			{
				remainder = num % 10;
				result += remainder;
				num = num / 10;
			}
			num = result;

		}
		return result;
	}

}
