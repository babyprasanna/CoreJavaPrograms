package strings;

import java.util.Scanner;

/**
 * This Program Find the Middle Letter Of Given String.
 * 
 * @author prasa
 *
 */

public class Find_Middle_Letter_Of_String {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = input.nextLine();
		System.out.println("String is : " + str + "\nString Length is : " + str.length());

		findMiddleLetter(str);

	}

	/**
	 * This Method Check The Middle Letter Of Given String.
	 * 
	 * @param str - String Noting Return Print Middle Letter With Index.
	 * 
	 */
	public static void findMiddleLetter(String str)

	{
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt((str.length() - 1) / 2);
			{
				System.out.println("Middele Letter is : " + c + "\nIn the index of : " + str.indexOf(c));
				break;
			}
		}

	}
}
