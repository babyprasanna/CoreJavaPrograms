package arrays;

import java.util.Scanner;

/**
 * 
 * 
 * This Class Continue with infinity Loop until enter 22 Number Enter Break Loop
 * And Print All Elements In Array along with 22
 * 
 * @author prasa
 *
 */
public class Exclude_Value_Print_Array {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int size[] = new int[1000];

		for (int i = 0; i < size.length; i++) {
			size[i] = input.nextInt();
			if (size[i] == 22) {
				break;
			}
		}
		for (int i = 0; i < size.length; i++)

		{
			System.out.print(size[i] + " ");

		}

	}

}
