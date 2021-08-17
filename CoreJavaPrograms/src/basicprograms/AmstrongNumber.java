package basicprograms;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		Boolean flag = amstrongNumber(num);
		if (flag == true) {
			System.out.println("Given Number : " + num + " is Amstrong Number");
		} else {
			System.out.println("Given Number : " + num + " is Not Amstrong Number");
		}

	}

	public static boolean amstrongNumber(int num) {
		int remainder = 0, result = 0,temp;
		temp = num;
		while (temp > 0) {
			remainder = temp % 10;
			result = (remainder * remainder * remainder) + result;
			temp = temp / 10;
		}
		System.out.println(result);
		if (num == result) {
			return true;
		} else {
			return false;
		}
	}

}
