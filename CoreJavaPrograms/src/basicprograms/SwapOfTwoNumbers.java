package basicprograms;

import java.util.Scanner;

public class SwapOfTwoNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("Before Swap  a :" + a + " b : " + b);
		
		swapTwoNubers(a, b);
		
	}

	private static void swapTwoNubers(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap a :" + a + " b : " + b);
	}

}
