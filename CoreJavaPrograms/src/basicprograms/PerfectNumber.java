package basicprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		boolean flag = perfectNumber(num);

		if (flag == true) {
			System.out.println("Given Number : " + num + " is Perfect Number");
		} else {
			System.out.println("Given Number : " + num + " is Not Perfect Number");
		}

	}

	public static boolean perfectNumber(int num) {
		int result = 1, temp;
		temp = num;// one times is same so result is 1
		for (int i = 2; i <= temp / 2; i++) //loop start 2 
		{
			if (temp % i == 0) //checking all divisors
				{

				result += i; //adding divisors
			}
		}
		System.out.println("Result is : " + result);
		
		if (num == result) {
			return true;
		} else {
			return false;
		}

	}

}
