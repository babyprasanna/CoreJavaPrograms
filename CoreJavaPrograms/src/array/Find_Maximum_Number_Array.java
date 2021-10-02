package array;

import java.util.Scanner;

/**
 * This Class Find Maximum Value in Given Array
 * 
 * @author prasa
 *
 */

public class Find_Maximum_Number_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[6];
		System.out.println("Enter Elements into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int maximum = findMaxOfArray(array);

		System.out.println("Maximum element in Array is : " + maximum);

		findMaxNumberOfArray(array);

		int max = maxNumber(array);
		System.out.println("Maximum element in Array is : " + max);
	}

	/**
	 * This Method Take Integer.MIN_VALUE takes Minimum value initially to check
	 * Maximum Value in Given Array
	 * 
	 * @param array
	 * @return
	 */

	private static int maxNumber(int[] array) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * This Method Initially taking minimum value is Zero(0) to Check Maximum value
	 * in Given Array
	 * 
	 * @param array
	 */

	private static void findMaxNumberOfArray(int[] array) {

		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Maximum element in Array is : " + max);

	}

	/**
	 * This Method Initially taking minimum value is Array[0] First Number is
	 * Minimum to Check Maximum value in Given Array
	 * 
	 * @param array
	 * @return
	 */

	private static int findMaxOfArray(int[] array) {

		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}
