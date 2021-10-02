package array;

import java.util.Scanner;

public class Reverse_Of_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Elements into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			reverseOfArray(array[i]);
		}

	}

	private static void reverseOfArray(int array) {

		int reverse = 0, remanider = 0;
		System.out.println("Reverse of array is :");
		
		for (int i = 0; i < array; i++) {
			remanider = array % 10;
			reverse = (reverse * 10) + remanider;
			array = array / 10;
			}
		System.out.println(reverse);
	}

}
