package array;

import java.util.Scanner;

public class WithOut_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		for (int i = 0; i <= array.length; i++) {
			array[i] = sc.nextInt();
			loopOfArray(array[i]);
		}

	}

	private static void loopOfArray(int array) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			if (array == -1) {
				break;
			}
			System.out.println(array);
			array = sc.nextInt();
		}
	}
}
