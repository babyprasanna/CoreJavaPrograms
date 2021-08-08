package basicprograms;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("number : " + num);

		int result = reverseNumber(num);
		System.out.println("reverse of number : " + result);
	}

	public static int reverseNumber(int num) {
		int reverse = 0, reminder = 0;
		while (num > 0) {
			reminder = num % 10;
			reverse = (reverse * 10) + reminder;
			num = num / 10;
		}

		return reverse;
	}

}
