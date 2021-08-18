package basicprograms;

import java.util.Scanner;

public class ParlindromOrNot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number : " );
		int num = input.nextInt();
		System.out.println("Before reverse Of number is : " + num);

		boolean flag = false;
		boolean result = palindromeOrNor(num);

		if(result == true) {
			System.out.println(num + " : Number is Palindrome");
		} else {
			System.out.println(num + " : Number is Not Palindrome");
		}
	}

	public static boolean palindromeOrNor(int number) {
		int reverse = 0, remainder = 0, temp;
		temp = number;
		while (temp > 0) {
			remainder = temp % 10;
			reverse = (reverse * 10) + remainder;
			temp = temp / 10;
		}
		System.out.println("After Reverse of number is : " + reverse);
		
		if (number == reverse) {
			return true;
		} else {
			return false;
		}
	}

}
