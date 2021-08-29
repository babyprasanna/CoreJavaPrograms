package arrays;

import java.util.Scanner;

/**
 * 
 * 
 * This Class is Find Element is Exist Or Not If element is Exist More Then one
 * time Gives Last Occurred Index Value
 * 
 * @author prasa
 *
 */

public class Element_Exist_Or_Not_Last_Occurence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Elements Into Array : ");
		int array[] = new int[5];
		int index = -1, key = 0;
		boolean flag = false;

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Enter Element Wants to Found : ");
		key = input.nextInt();

		for (int i = 0; i < array.length; i++) {
			index = i;
			if (array[i] == key) {
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println(key + " : Element is Found" + " In The Index of " + index);
		} else {
			System.out.println(key + " : Element is Not Found In Array");
		}
	}

}
