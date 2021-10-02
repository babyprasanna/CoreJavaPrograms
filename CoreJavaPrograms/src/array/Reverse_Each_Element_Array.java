package array;

import java.util.Scanner;

public class Reverse_Each_Element_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];

		System.out.println("Enter Elements Into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			array[i] = reverseOfArray(array[i]);

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("reverse is : " + array[i]);
		}
	}

	private static int reverseOfArray(int array) {

		int reverse = 0, remainder = 0;

		for (int i = 0; i < array; i++) {
			reverse = 0;
			while (array > 0) {
				remainder = array % 10;
				reverse = (reverse * 10) + remainder;
				array = array / 10;
			}
		}
		return reverse;
	}
}