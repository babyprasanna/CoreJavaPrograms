package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortElements {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

		names.add("Am");
		names.add("Me");
		names.add("Cool");
		names.add("Zebra");
		names.add("Double");

		Collections.sort(names);
		for (String s : names) {
			System.out.println(s);
		}
	}
}
