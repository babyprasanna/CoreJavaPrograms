package basicprograms;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		boolean flag = evenOdd(num);
		if (flag == true) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}
	}

	public static boolean evenOdd(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
