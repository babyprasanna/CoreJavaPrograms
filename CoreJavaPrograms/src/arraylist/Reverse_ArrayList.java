package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_ArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arraylist = new ArrayList();
		System.out.println("Enter Elements into Array List : ");

		for (int i = 0; i < 5; i++) {
			arraylist.add(sc.nextInt());
		}

		reverseArrayList(arraylist);
	}

	private static void reverseArrayList(ArrayList<Integer> arraylist) {

		System.out.print("Reverse Of Array List Elements : ");
		for (int i = arraylist.size() - 1; i >= 0; i--) {
			System.out.print(arraylist.get(i) + " ");
		}

	}
}
