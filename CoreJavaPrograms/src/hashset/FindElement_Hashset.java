package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class FindElement_Hashset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashSet<Integer> hashset = new HashSet();
		System.out.println("Enter Elements into HashSet : ");

		for (int i = 0; i < 5; i++) {
			hashset.add(sc.nextInt());
		}
		int key = 0;
		System.out.println("Enter Elements to Find In HashSet : ");
		key = sc.nextInt();
		
		boolean findelement = isElement(hashset, key);

		if (findelement) {
			System.out.println("Element is Exist in HashSet");
		} else {
			System.out.println("Element is Not Found In HashSet");
		}
	}

	private static boolean isElement(HashSet<Integer> hashset, int key) {

		boolean flag = false;

		for (int number : hashset) {
			if (key == number) {
				flag = true;
			}
		}
		return flag;
	}

}
