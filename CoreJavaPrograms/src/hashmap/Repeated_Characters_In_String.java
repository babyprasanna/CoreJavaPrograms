package hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Repeated_Characters_In_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Character, Integer> string = new HashMap();

		String str = "hello_am_cool";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (string.containsKey(c)) {
				int value = string.get(c);
				string.put(c, value + 1);
			} else {
				string.put(c, 1);
			}
		}

		for (Entry<Character, Integer> repeatedcharacters : string.entrySet()) {
			System.out.println(repeatedcharacters.getKey() + " -- >" + repeatedcharacters.getValue());
		}
	}
}
