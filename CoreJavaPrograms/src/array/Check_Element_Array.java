package array;

import java.util.Scanner;

public class Check_Element_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements into Array : ");
		int array[] = new int[5];

		for (int i = 0; i < array.length; i++) {

			array[i] = sc.nextInt();
		}

		int key = 0;
		System.out.println("Enter Element to Find in Array : ");
		key = sc.nextInt();

		findElement(array, key);
	}

	private static void findElement(int[] number, int key) {
		boolean flag = false;
		int index = -1;

		for (int i = 0; i < number.length; i++) {
			if (number[i] == key) {
				// System.out.println(number[i] + " " + key);
				index = i;
				flag = true;
				break;
			}

		}
		if (flag) {
			System.out.println(key + " = Element is exist in Array  " + index + " : is Index");
		} else {
			System.out.println(key + " = Not Exist in Array");
		}
	}

}
