package strings;

import java.util.Scanner;

/**
 * This Program Find The Capital And Small Letters In Given String. And give
 * Number of Capital Letter And Small letters count in given String.
 * 
 * @author prasa
 *
 */

public class CaptialAndSmallLetterString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = input.nextLine();

		System.out.println("Given String is : " + str);

		captialAndSmallLetterString(str);
	}

	/**
	 * This Method to check Capital and Small Letters in given String. And Gives the
	 * Count Of Number Of Small And Capital Letters In String.
	 * 
	 * @param str - The String Noting Return- print Capital And Small Letters with
	 *            Count.
	 */
	private static void captialAndSmallLetterString(String str) {

		int count = 0, count1 = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c >= 65 && c <= 90) {
				System.out.println(c + " is Captial Letter ");
				count++;
			} else {
				System.out.println(c + " is Small Letter");
				count1++;
			}
		}
		System.out.println("Captial letters in String is : " + count);
		System.out.println("Small letters in String is : " + count1);

	}
}
