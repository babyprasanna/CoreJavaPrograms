package strings;

import java.util.Scanner;

/**
 * Class Give a String To Reverse.
 * 
 * @author prasa
 *
 */

public class ReverseOfString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = input.nextLine();
		System.out.println("String Before Reverse : " + str);

		reverseOfString(str);

	}

	/**
	 * This Method Reverse a given String.
	 * 
	 * @param string - String print String after Reverse String.
	 */

	public static void reverseOfString(String string) {
		String str1 = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			str1 = str1 + string.charAt(i);
		}
		System.out.println("String After Reverse Is : " + str1);
	}

}
