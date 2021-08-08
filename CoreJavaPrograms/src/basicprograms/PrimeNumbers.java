package basicprograms;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		primeNumber(num);

	}

	public static void primeNumber(int num) {
		int count = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				count ++;
			}

		}

	}
}//doubt
