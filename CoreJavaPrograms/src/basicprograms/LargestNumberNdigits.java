package basicprograms;

import java.util.Scanner;

public class LargestNumberNdigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();

		largeNumber(a, b, c, d);

	}

	public static void largeNumber(int a, int b, int c, int d) {
		if (a > b && a > c && a > d) {
			System.out.println("A is Large : " + a);

		} else if (b > c && b > d) {
			System.out.println("B is Large : " + b);

		} else if (c > d) {
			System.out.println("C is Large : " + c);

		} else {
			System.out.println("D is Large : " + d);

		}
	}
}
