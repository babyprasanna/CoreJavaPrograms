package strings;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = input.nextLine();
		System.out.println("Before Reverse Of String : " + str);

		boolean falg = false;
		boolean result = isPalindromeOrNot(str);
		if (result == true) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " is Not Palindrome");
		}
	}

	private static boolean isPalindromeOrNot(String str) {

		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		System.out.println("After Reverse Of String : " + result);

		if (str.equals(result)) {
			return true;
		} else {
			return false;
		}
	}
}
