package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Find_Element_List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arraylist = new ArrayList();
		System.out.println("Enter Elements into List : ");

		for (int i = 0; i < 5; i++) {
			arraylist.add(sc.nextInt());
		}
		int key = 0;
		System.out.println("Enter Element to find in Array List : ");
		key = sc.nextInt();

		boolean flag = arraylist(key, arraylist);

		if (flag == true) {
			System.out.println("Element exist in Array List");
		} else {
			System.out.println("Element Not Exist In List");
		}
	}

	private static boolean arraylist(int key, ArrayList<Integer> arraylist) {

		boolean flag = false;

		for (int i = 0; i < arraylist.size(); i++) {

			if (arraylist.get(i) == key) {
				flag = true;
			}
		}
		return flag;
	}
}
