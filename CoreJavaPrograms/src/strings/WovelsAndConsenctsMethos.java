package strings;

import java.util.Scanner;

public class WovelsAndConsenctsMethos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = input.nextLine();
		System.out.println("Given String :" + str);

		isVowels(str);
	}

	private static void isVowels(String str) {
		int count = 0, count1 = 0;
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U')
			{
				System.out.println(c + " is Vowel");
				count++;
			}
			else
			{
				System.out.println(c + " is Consencts");
				count1++;
			}
		}
		System.out.println("Vowels in Given String is : " + count);
		System.out.println("Consencts in Given String is : " + count1);
	}
}
