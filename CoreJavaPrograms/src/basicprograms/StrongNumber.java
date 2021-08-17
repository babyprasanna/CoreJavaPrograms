package basicprograms;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		boolean flag = strongNumber(num);

		if (flag == true) {
			System.out.println(" Given Number : "+ num + " Strong Number");
		} else {
			System.out.println("Given Number : " + num + " Not Strong Number");
		}
	}

	public static boolean strongNumber(int num) {
		int sum = 0, result = 0, temp;
		temp = num;
		while (temp > 0) {
			int remainder = 0;
			remainder = temp % 10;
			result = 1;
			for (int i = remainder; i > 0; i--) {

				result = (result * i);
			}
			temp = temp / 10;
			sum = sum + result;

		}
		if (sum == num) {
			return true;
		} else {
			return false;
		}
	}

}
