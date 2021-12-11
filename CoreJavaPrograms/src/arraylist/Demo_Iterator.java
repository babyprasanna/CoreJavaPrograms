package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_Iterator {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(9);
		list.add(54);

		Iterator<Integer> it = list.iterator();

		System.out.println(it.next());
	}
}
