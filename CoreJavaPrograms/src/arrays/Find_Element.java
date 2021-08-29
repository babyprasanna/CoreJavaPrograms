package arrays;

import java.util.Scanner;

/**
 * This class Find Element exist In Given Array List Or Not
 * 
 * @author prasa
 *
 */

public class Find_Element {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter elements : ");
		int array[] = new int[5];
		int key = 0;
		boolean flag = false;

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter element you need to find : ");
		key = sc.nextInt();
		for (int i = 0; i < array.length; i++) {

			if (array[i] == key) {
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println(key + " : Element is Exist in Array");
		} else {
			System.out.println(key + " : Element is Not Found in Array");
		}

	}

}
