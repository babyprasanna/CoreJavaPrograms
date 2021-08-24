package strings;

import java.util.Scanner;

/**
 * This We Swap First and Last Characters of Given String.
 * 
 * @author prasa
 *
 */

public class Swap_First_Last_Charcters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = input.nextLine();
		System.out.println("String is : " + str);

		String first = getFirstCharcter(str);
		String last = getlastCharcter(str);
		String swap = getSwapofCharcters(str, first, last);
		System.out.println(swap);

	}

	/**
	 * This Method Get The First Letter Of Given String
	 * 
	 * @param str - String
	 * @return String - first Character of given String.
	 * 
	 */

	public static String getFirstCharcter(String str) {
		String first = "";

		for (int i = 0; i <= str.length() - 1; i++) {
			first = first + str.charAt(i);
			{
				System.out.println(first);
				break;
			}
		}
		return first;
	}

	/**
	 * This Method Gives Last Character in Given String
	 * 
	 * @param str - String
	 * @return String - Last Character of given String.
	 */

	public static String getlastCharcter(String str) {
		String last = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			last = last + str.charAt(str.length() - 1);
			{
				System.out.println(last);
				break;
			}

		}
		return last;

	}

	/**
	 * This Swap The Given String First and Last Characters.
	 * 
	 * @param first - String
	 * @param str   - String
	 * @param last  - String
	 * @return String - Return String After Swap Of First And Last Chatacters
	 */

	public static String getSwapofCharcters(String first, String str, String last) {
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}

		// System.out.println("String After Reverse Is : " + str1);

		return first + str1 + last;
	}
}