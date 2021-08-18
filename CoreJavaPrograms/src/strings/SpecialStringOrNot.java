package strings;

import java.util.Scanner;

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

	private static boolean isOwel(char letter) {
		

		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A'
				|| letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {

			return true;

		} else {

			return false;
		}
	}
}
