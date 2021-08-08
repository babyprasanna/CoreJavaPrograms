package basicprograms;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int sum = addTwoNumbers(a, b);
	
		System.out.println("sum is " + sum);
	}

	public static int addTwoNumbers(int a, int b) {

		int c = a + b;
		return c;
	}

}
