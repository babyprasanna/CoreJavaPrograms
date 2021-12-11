package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class InsertValues_Hashset {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<Integer, String> string = new HashMap<>();

		string.put(1, "hai");
		string.put(2, "Am");
		string.put(3, "hello");

		System.out.println(string.get(2));
		System.out.println(string.get(1));

		for (Entry<Integer, String> list : string.entrySet()) {

			System.out.println(list.getKey() + " = " + list.getValue());
		}

	}
}
