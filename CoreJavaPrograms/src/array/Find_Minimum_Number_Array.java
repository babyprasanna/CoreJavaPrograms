package array;

import java.util.Scanner;

/**
 * This Class To Check Minimum Number in Given Array
 * 
 * @author prasa
 *
 */

public class Find_Minimum_Number_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter Elements into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int minimumnumber = minimumNumber(array);
		System.out.println("Minimum Value In Array is : " + minimumnumber);

	}

	/**
	 * This Method Take Integer.MAX_VALUE takes Minimum value initially to check
	 * Minimum Value in Given Array
	 * 
	 * @param array
	 * @return int
	 */
	public static int minimumNumber(int[] array) {
		int minimum = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (minimum > array[i]) {
				minimum = array[i];
			}
		}
		return minimum;
	}

}
