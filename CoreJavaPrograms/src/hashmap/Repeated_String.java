package hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Repeated_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> string = new HashMap();

		String[] str = new String[5];
		System.out.println("Enter Strings into Array : ");

		for (int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine();
		}
		for (String str1 : str) {
			if (string.containsKey(str1)) {
				int value = string.get(str1);
				string.put(str1, value + 1);
			} else {
				string.put(str1, 1);
			}
		}
		for (Entry<String, Integer> repeatedstring : string.entrySet()) {
			System.out.println(repeatedstring.getKey() + " -- >" + repeatedstring.getValue());
		}
	}

}
