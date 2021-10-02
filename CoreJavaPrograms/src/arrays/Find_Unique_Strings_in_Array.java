package arrays;

import java.util.HashSet;
import java.util.Scanner;

public class Find_Unique_Strings_in_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashSet<String> string = new HashSet();
		System.out.println("Enter Strings : ");

		for (int i = 0; i < 5; i++) {
			string.add(sc.nextLine());
		}
		// System.out.println("Strings in Array is : " + string);
		uniqueStringsArray(string);
	}

	private static void uniqueStringsArray(HashSet<String> string) {

		for (String string1 : string) {
			string.add(string1);
		}
		System.out.println("Unique Strings is : " + string);

	}

}
