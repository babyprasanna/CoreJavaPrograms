package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class No_Of_Times_Element_Occured {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arraylist = new ArrayList();
		System.out.println("Enter Elements into Array List : ");
		int element = 0;

		for (int i = 0; i < 5; i++) {
			arraylist.add(sc.nextInt());
		}
		for (int i = 0; i < arraylist.size(); i++) {
			{
				element = arraylist.get(i);
			}

			noofOccureElement(arraylist, element);
		}
	}

	private static void noofOccureElement(ArrayList<Integer> arraylist, int element) {
		int count = 0;

		for (int i = 0; i < arraylist.size(); i++) {
			{
				if (arraylist.get(i) == element)
					count++;
			}
		}

		System.out.println(element + " occured " + count + " Times");
	}
}