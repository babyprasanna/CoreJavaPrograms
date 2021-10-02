package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Even_Odd_ArrayListElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arraylist = new ArrayList();
		System.out.println("Enter Elements into Array List : ");

		for (int i = 0; i < 5; i++) {
			arraylist.add(sc.nextInt());
		}
		for (int i = 0; i < arraylist.size(); i++) {
			boolean flag = evenOddElements(arraylist.get(i));
			if (flag == true) {
				System.out.println(arraylist.get(i) + " : Element is Even");
			} else {
				System.out.println(arraylist.get(i) + " : Element is ODD");
			}
		}

	}

	private static boolean evenOddElements(int num) {

		if(num % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
