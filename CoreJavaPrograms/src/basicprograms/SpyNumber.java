package basicprograms;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		boolean flag = spyNumber(num);

		if (flag == true) {
			System.out.println("Spy Number");
		} else {
			System.out.println("Not Spy Number");
		}
	}

	public static boolean spyNumber(int num) {
		int mul = 1, sum = 0, remainder = 0;

		while (num > 0) {
			remainder = num % 10;
			sum += remainder;
			mul *= remainder;
			num = num / 10;
		}
		System.out.println(sum);
		System.out.println(mul);
		
		if (sum == mul) {
			return true;
		} else {
			return false;
		}
	}

}
