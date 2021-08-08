package basicprograms;

import java.util.Scanner;

public class ParlindromOrNot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(num);

		int result = palindromeOrNor(num);
		if (num == result) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

	public static int palindromeOrNor(int num) {
		int reverse = 0, remainder = 0;  // no  need to num = temp
		
		while (num > 0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}
		System.out.println(reverse);
		return reverse;
	}

}
