package strings;

import java.util.Scanner;

/**
 * Find The Given String Number Of Characters and Numbers And Special
 * Characters.
 * 
 * @author prasa
 *
 */

public class FindCharNumOrSpelCahrInString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = input.nextLine();

		System.out.println("String is : " + str);

		charNumOrSpelCah(str);
	}

	/**
	 * This Method Check The Given String existed Characters and Special Characters
	 * and Numbers.
	 * 
	 * @param str - string Noting return print Characters with count and Numbers
	 *            With Count and Special Characters With Count.
	 */
	public static void charNumOrSpelCah(String str) {
		int count = 0, count1 = 0, count2 = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
				System.out.println(c + " is Letters");
				count++;
			} else if (c >= 47 && c <= 57) {
				System.out.println(c + " is Numbers");
				count1++;
			} else {
				System.out.println(c + " is Special Characters");
				count2++;
			}
		}
		System.out.println("Count Of Letters in String is : " + count);
		System.out.println("Count Of Numbers in String is : " + count1);
		System.out.println("Count Of Special Characters in String is : " + count2);

	}
}
