package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class PrintElements_Static {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements into HashSet : ");
		HashSet<Integer> hashlist = new HashSet();

		for (int i = 0; i < 5; i++) {
			hashlist.add(sc.nextInt());
		}
		hashSet(hashlist);

	}

	private static void hashSet(HashSet<Integer> hashlist) {
		
		System.out.println("Elements in HashList is : ");
		for (int number : hashlist) {
			System.out.print(number + " ");
		}
	}
}
