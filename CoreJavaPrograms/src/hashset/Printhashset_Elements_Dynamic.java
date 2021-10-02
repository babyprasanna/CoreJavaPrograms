package hashset;

import java.util.HashSet;

public class Printhashset_Elements_Dynamic {
	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet();

		hashset.add(2);
		hashset.add(5);
		hashset.add(4);
		hashset.add(2);
		hashset.add(3);
		hashset.add(1);
		hashset.add(3);
		hashset.add(3);

		System.out.println("HashSet Elements Are : ");
		for (int number : hashset) {
		System.out.print(number + " ");
		}
	}

}
