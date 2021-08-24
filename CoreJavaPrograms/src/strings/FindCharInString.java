package strings;

/**
 * We Find The Given Character Exist in Given String Or Not.
 * 
 * @author prasa
 *
 */

public class FindCharInString {
	public static void main(String[] args) {

		String str = "Raj Am Cool";

		System.out.println("String is : " + str);

		boolean flag = false;
		boolean letter = isCharExistOrNot(str);
		if (true) {
			System.out.println("Letter There in String");

		} else {
			System.out.println("Letter Not There in String");
		}
	}

	/**
	 * This Method Check Given String Whether the Given Character Exist Or Not.
	 * 
	 * @param str - String
	 * 
	 * @return True / False - Whether the Given Letter is Exist Gives True if Not
	 *         False.
	 */
	public static boolean isCharExistOrNot(String str) {
		char key = 'o';
		// char key = 'r';
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == key) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Char is : " + key);
			System.out.println("In the Index Of : " + str.indexOf(key));
			return true;
		} else {
			return false;
		}
	}
}
