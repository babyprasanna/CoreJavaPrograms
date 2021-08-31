package arrays;

import java.util.Scanner;

/**
 * This Class Prints Array And Gives Count Of Array
 * 
 * @author prasa
 *
 */
public class No_Of_Times_Occurs_Elements_Array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int array[] = new int[5];
		int count = 0, element = 0;
		System.out.println();
		element = input.nextInt();
		System.out.println("Enter Elements Into Array : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			count = i;
			{
				if (array[i] == element)
					count++;
			}
			System.out.println(array[i] + " occured " + count + " Times");
		}
	}
}
