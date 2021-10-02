package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintUp_To_ValueCon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements into Array List : ");
		ArrayList<Integer> arraylist = new ArrayList();

		for (int i = 0; i < 30; i++) {
			arraylist.add(sc.nextInt());
			
			if (arraylist.get(i) == 22) {
				break;
			}
		}

		arrayList(arraylist);
	}

	private static void arrayList(ArrayList<Integer> arraylist) {

		System.out.println("Elements in Array List is : ");

		for (int i = 0; i < arraylist.size(); i++) {

			System.out.println(arraylist.get(i));
		}
	}

}
