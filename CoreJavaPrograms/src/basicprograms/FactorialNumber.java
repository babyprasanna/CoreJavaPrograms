package basicprograms;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int factorial = factorialOfNumbner(num);
		System.out.println(factorial);
		
	}
	public static int factorialOfNumbner(int num)
	{
		int sum = 1;
		for (int i = num; i > 0; i --)
		{
			//System.out.println(i);
			sum = sum * i;
			//System.out.println(sum);
		}
		return sum;
	}

}
