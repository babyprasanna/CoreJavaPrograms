package strings;

import java.util.Scanner;

/**
 * Reverse Half String In Given String.
 * 
 * @author prasa
 *
 */

public class Reverse_Of_Half_String {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = input.nextLine();
		System.out.println("String is : " + str);

		reverseOfHalfString(str);

	}

	/**
	 * This Method to get Half String in given String and reverse half String.
	 * 
	 * @param str - String print reverse String.
	 */
	public static void reverseOfHalfString(String str) {
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < (str.length() / 2); i++) {
			char c = str.charAt(str.length() - 1);
			{
				str1 = str1 + str.charAt(i);
			}
			for (int j = str.length() - 1; j > 0; j--) {
				str2 = str2 + str1.charAt(j);
			}

		}
		// System.out.println(" Half String is : " + str1);
		System.out.println(str2);
	}

}
