package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements into List : ");
		ArrayList<Integer> arraylist = new ArrayList();

		for (int i = 0; i < 5; i++) {
			arraylist.add(sc.nextInt());
		}
		arraylist.add(25); // Add Elements into list
		arrayList(arraylist);

	}

	private static void arrayList(ArrayList<Integer> arraylist) {

		System.out.println("The List of Elements is : ");

		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i) + " ");

		}
	}
}