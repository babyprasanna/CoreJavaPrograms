package arrays;

import java.util.Scanner;

/**
 * This class Print values if value is 22 exclude that 22 print other elements
 * 
 * @author prasa
 *
 */

public class Expect_value_print_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (array[i] == 22) {
				i--;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("Elements in array : " + array[i]);
		}

	}

}
