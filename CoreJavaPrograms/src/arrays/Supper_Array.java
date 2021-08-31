package arrays;

import java.util.Scanner;

/**
 * This Class Check Array is Super Array Or Not. Super Array means Given random
 * number is sum of Array Elements is equal to Given Random Number is Called
 * super array else Not An Super Array.
 * 
 * @author prasa
 *
 */

public class Supper_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[5];
		int value, sum = 0;
		boolean flag = false;
		System.out.println("Enter Elements Into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Enter a value : ");
		value = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				sum = array[i] + array[j];
				if (sum == value) {
					flag = true;
				} else {
					flag = false;
				}

			}
		}
		if (flag) {
			System.out.println("Super Array");
		} else {
			System.out.println("Not a Super Array");
		}
	}

}
