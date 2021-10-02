package array;

import java.util.Scanner;

public class Print_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[5];
		System.out.println("Enter Elements into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		arrayPrint(array);
	}

	private static void arrayPrint(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
