package arrays;

import java.util.Scanner;

public class Find_Even_Odd_Num_Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[5];
		System.out.println("Enter Elements Into Array : ");

		int count = 0, count1 = 0;

		for (int i = 0; i < array.length; i++) {

			array[i] = sc.nextInt();

		}
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {
				count++;
			} else {
				count1++;
			}
		}

		System.out.println("Even Number Count is : " + count);

		System.out.println("Odd Number Count is : " + count1);
	}
}