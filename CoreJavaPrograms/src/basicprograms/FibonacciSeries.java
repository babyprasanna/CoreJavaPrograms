package basicprograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		fibonacciSeries(num);

	}

	public static void fibonacciSeries(int num) {
		int first = 0, next = 1, result = 0;

		System.out.print(first + " ");
		System.out.print(" " + next + " ");
		for (int i = 2; i < num; i++) {
			result = first + next;
			System.out.print(" " + result + " ");
			first = next;
			next = result;
			
		}

	}

}
