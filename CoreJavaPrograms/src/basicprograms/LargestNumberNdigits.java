package basicprograms;

import java.util.Scanner;

public class LargestNumberNdigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();

		int largenumber = largeNumber(a, b, c, d);
		System.out.println(largenumber);
	}

	public static int largeNumber(int a, int b, int c, int d) {
		if (a > b && a > c && a > d) {
			return a;
		} else if (b > c && b > d) {
			return b;
		} else if (c > d) {
			return c;
		} else {
			return d;
		}
	}

}
