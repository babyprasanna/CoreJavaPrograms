package arrays;

import java.util.Scanner;

public class Reverse_Each_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[5];
		System.out.print("Enter Elements Into Array : ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		
		int temp[] = reverseEachNumberInArray(array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " = " + temp[i]);
		}
		
	}

	private static int[] reverseEachNumberInArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = reverseOf(arr[i]);
			System.out.println(arr[i]);
		}
		
		return arr;
		
	}

	private static int reverseOf(int num) {
		
		int reverse = 0, reminder;
		while (num > 0) {
			reminder = num % 10;
			reverse = (reverse * 10) + reminder;
			num = num / 10;
		}
		//System.out.println(reverse);
		return reverse;
		
	}

}
