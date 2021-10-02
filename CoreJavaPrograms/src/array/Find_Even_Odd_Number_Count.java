package array;

import java.util.Scanner;

public class Find_Even_Odd_Number_Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[5];
		System.out.println("Enter Elements into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			evenOddCount(array);
		}
	}

	private static void evenOddCount(int[] array) {
		int count = 0, count1 = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {
				count++;
			} else {
				count1++;
			}
		}
		System.out.println("Even Numbers Count is : " + count);
		System.out.println(" Odd Numbers Count is : " + count1);
	}
}
