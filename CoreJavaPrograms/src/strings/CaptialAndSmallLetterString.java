package strings;

import java.util.Scanner;

public class CaptialAndSmallLetterString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = input.nextLine();

		System.out.println("Given String is : " + str);

		isCaptialAndSmallLetterString(str);
	}

	private static void isCaptialAndSmallLetterString(String str) {
		
		int count = 0,count1 = 0;
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
