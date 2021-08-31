package arrays;

import java.util.Scanner;

/**
 * This Class Check Enter Element is Exist In Array Or Not If Exist The Given
 * Element Print The Index value of that element If Not Exist The Give Element
 * Print -1
 * 
 * @author prasa
 *
 */

public class Check_Element_With_Indexs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int array[] = new int[5];
		int value, index = -1, count = 0;
		boolean flag = false;

		System.out.println("Enter Elements into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("Enter a Element : ");
		value = input.nextInt();
		System.out.println("Given Element " + value);

		for (int i = 0; i < array.length; i++) {
			index = i;
			if (array[i] == value) {

				System.out.println(" \n Index Of Element is : " + index);
				count++;
			}
		}

		System.out.println("\n Count of Element Occured In Array : " + count);

		if (flag) {
			System.out.println(" ");
		} else {
			System.out.println("-1");
		}

	}

}
