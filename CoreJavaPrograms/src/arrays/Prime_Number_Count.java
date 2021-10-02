package arrays;

import java.util.Scanner;

public class Prime_Number_Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[5];
		System.out.println("Enter Elements Into Array : ");
		boolean flag = false;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				{
					if (array[i] % array[j] == 0) {
						System.out.println(array[j]);
						count++;
					}
				}
			}
		}
		System.out.println("Count is : " + count);
	}

}
