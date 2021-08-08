package basicprograms;

import java.util.Scanner;

public class SwapWithOutThirdVariable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();

		System.out.println("Before Swap : a : " + a + " b :" + b);

		swapTwoNumber(a, b);

	}

	public static void swapTwoNumber(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after Swap : a : " + a + " b : " + b);
	}

}
