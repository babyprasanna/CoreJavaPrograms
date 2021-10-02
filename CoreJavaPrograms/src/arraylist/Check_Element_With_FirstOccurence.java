package arraylist;

import java.util.ArrayList;

import java.util.Scanner;

public class Check_Element_With_FirstOccurence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>arraylist = new ArrayList();
		int index = -1;
		
		System.out.println("Enter Elements into List : ");

		for (int i = 0; i < 5; i++) {
			index = i;
			arraylist.add(sc.nextInt(i));
		}
		int key = 0;
		System.out.println("Enter Element to find in Array List : ");
		key = sc.nextInt();

		boolean flag = arraylist(arraylist, key);
		
		if (flag) {
			System.out.println("Element is Found : " + index + " place");
		} else {
			System.out.println("Element is Not Found");
		}

	}

	private static boolean arraylist(ArrayList<Integer> arraylist, int key) {

		boolean flag = false;

		for (int i = 0; i < arraylist.size(); i++) {

			if (arraylist.get(i) == key) {
				flag = true;
			}
		}
		return flag;

	}

}
