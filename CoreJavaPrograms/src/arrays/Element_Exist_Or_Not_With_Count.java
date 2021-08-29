package arrays;

import java.util.Scanner;

/**
 * 
 * 
 * This Class Find Element is Exist Or Not if Element is Exist more then one
 * time gives count of Occurred element with index value
 * 
 * @author prasa
 *
 */

public class Element_Exist_Or_Not_With_Count {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Elements Into Array : ");
		int array[] = new int[5];

		int index = -1, key = 0, count = 0;

		boolean flag = false;

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Enter Element to Find : ");
		key = input.nextInt();

		for (int i = 0; i < array.length; i++) {
			index = i;
			if (array[i] == key) {
				flag = true;
				count++;
			}
		}
		if (flag == true) {
			System.out.println(
					key + ": Element is Found" + "Index of " + index + " count of element  Occurred is : " + count);
		} else {
			System.out.println(key + " : Element is Not Found In Array");
		}
	}
}
