package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class RepeatedString {
	public static void main(String[] args) {

		String[] str = { "hai", "hello", "hai", "hello", "me" };
		HashMap<String, Integer> map = new HashMap<>();

		for (String string : str) {
			if (map.containsKey(string)) {
				int value = map.get(string);
				map.put(string, value + 1);

			} else {
				map.put(string, 1);
			}
		}
		for (Entry<String, Integer> repeatedstring : map.entrySet()) {
			System.out.println(repeatedstring.getKey() + " " + repeatedstring.getValue());
		}
	}

}
