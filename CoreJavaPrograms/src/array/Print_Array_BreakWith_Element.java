package array;

import java.util.Scanner;

public class Print_Array_BreakWith_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[5];
		System.out.println("Enter Elements into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (array[i] == 22) {
				break;
			}
		}
		elementBreakLoop(array);

	}

	private static void elementBreakLoop(int[] number)

	{
		System.out.println("Elements in Array : ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}
}