package strings;

import java.util.Scanner;

public class FindCharNumOrSpelCahrMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = input.nextLine();

		System.out.println("String is : " + str);

		isCharNumOrSpelCah(str);
	}

	public static void isCharNumOrSpelCah(String str) {
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
