package arrays;

import java.util.Scanner;

/**
 * 
 * 
 * This Class Check Element is Exist Or Not if element is exist.
 *  Give The Element Index Value
 * 
 * @author prasa
 *
 */

public class Find_First_Occurence_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Elements into Array : ");
		int array[] = new int[5];
		int key = 0, index = -1;

		boolean flag = false;

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter Element to Find In Array :  ");
		key = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			index = i;
			if (array[i] == key) {
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println(key + " : is found in array " + "in the  Index of " + index);
		} else {
			System.out.println(key + " : Element Not Found");
		}

	}

}
