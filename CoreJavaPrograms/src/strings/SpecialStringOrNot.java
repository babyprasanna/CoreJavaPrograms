package strings;

import java.util.Scanner;

/**
 * This Program We Find The Given String is Special String Or Not.
 * 
 * @author prasa - Special String - Given String Two Vowels are side by side
 *         Call Special String. Sample Input1 : Am Cool Here 'o' 'o' Vowels and
 *         Side by side so Given Input is Special String. sample input2 : Hello
 *         world No Vowels are side by side in given String So Given String is
 *         Not Special String. check Vowels first and second characters in given
 *         string both side by side print Special String else Not Special
 *         String.
 */

public class SpecialStringOrNot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String string = input.nextLine();
		System.out.println("String is : " + string);

		boolean flag = false;

		for (int i = 0; i < string.length() - 1; i++) {

			char first = string.charAt(i);
			char second = string.charAt(i + 1);

			if (isOwel(first) && isOwel(second)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(string + " : is a special string");
		} else {
			System.out.println(string + " : is not a special string");
		}

	}

	/**
	 * Find the Vowels in given String.
	 * 
	 * @param letter - Single Characters of String.
	 * @return True / False - Having an Vowels in Given String return True Else
	 *         gives False
	 */

	private static boolean isOwel(char letter) {

		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A'
				|| letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {

			return true;

		} else {

			return false;
		}
	}
}
