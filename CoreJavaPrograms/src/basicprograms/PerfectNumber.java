package basicprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		int perfectnumber = perfectNumber(num);

		if (num == perfectnumber) {
			System.out.println("perfect number");
		} else {
			System.out.println("not perfect number");
		}

	}

	public static int perfectNumber(int num) {
		int result = 1; // one times is same so result is 1
		for (int i = 2; i <= num / 2; i++) //loop start 2 
		{
			if (num % i == 0) //checking all divisors
				{

				result += i; //adding divisors
			}
		}
		System.out.println(result);
		return result;
	}

}
