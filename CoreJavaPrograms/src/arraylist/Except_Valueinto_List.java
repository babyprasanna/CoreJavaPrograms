package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Except_Valueinto_List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arraylist = new ArrayList();
		System.out.println("Elements into Array List : ");

		for (int i = 0; i < 6; i++) {
			arraylist.add(sc.nextInt());
			if (arraylist.get(i) == 22) {
				arraylist.remove(i); //Eleminate 22 into list
				i--; //decress the index value
				
			}
		}
		arrayList(arraylist);
	}

	private static void arrayList(ArrayList<Integer> arraylist) {

		System.out.println("Elements in Array List is : ");

		for (int i = 0; i < arraylist.size(); i++) {

			System.out.print(arraylist.get(i) + " ");
		}
	}
}
