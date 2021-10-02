package arrays;

import java.util.Scanner;

public class AmstrongNumbers_Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[5];
		int count = 0;
		System.out.println("Enter Elements into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println(amstrongNumber(array));
	}

	private static int amstrongNumber(int[] number) {
		int remainder = 0, result = 0, count = 0;
		int temp;

		for (int i = 0; i < number.length; i++) {
			temp = number[i];
			result = 0;
			
			while (temp > 9) {
				while (temp > 0) {
					remainder = temp % 10;
					result = (remainder * remainder * remainder) + result;
					temp = temp / 10;
				}
				if (number[i] == result) {
					count++;
					System.out.println("" + count);
					
				}
			}
		}
		return count;
	}
}