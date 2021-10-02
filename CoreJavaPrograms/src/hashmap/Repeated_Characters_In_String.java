package hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Repeated_Characters_In_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> string = new HashMap();

		String[] str = new String[5];
		System.out.println("Enter Strings into Array : ");

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			for (char str2 : c) {

				if (string.containsKey(str2)) {
					int value = string.get(str2);
					string.put(str2, value + 1);
				} else {
					string.put(str2, 1);
				}
			}

		}

		for (Entry<String, Integer> repeatedcharacters : string.entrySet()) {
			System.out.println(repeatedcharacters.getKey() + " -- >" + repeatedcharacters.getValue());
		}
	}
}
