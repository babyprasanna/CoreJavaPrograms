package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_Each_Elements_Arraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arraylist = new ArrayList();
		System.out.println("Enter Elements Into Array List : ");

		for (int i = 0; i < 5; i++) {
			arraylist.add(sc.nextInt());
		}
		ArrayList<Integer> arraylist1 = reverseArrayList(arraylist);
		for(int num : arraylist1) {
			System.out.println(num);
		}
	}

	private static ArrayList<Integer> reverseArrayList(ArrayList<Integer> arraylist) {
		
		ArrayList<Integer> arraylist1 = new ArrayList<>();
		System.out.println("Reverse of Elements in Array : ");
		for (int i = 0; i < arraylist.size(); i++) {
			int reverse = reverseArrayListElements(arraylist.get(i));
			arraylist1.add(reverse);
		}
		return arraylist1;
	}

	private static int reverseArrayListElements(Integer num) {

		int reverse = 0, reminder;
		while (num > 0) {
			reminder = num % 10;
			reverse = (reverse * 10) + reminder;
			num = num / 10;
		}
		return reverse;
	}
}
