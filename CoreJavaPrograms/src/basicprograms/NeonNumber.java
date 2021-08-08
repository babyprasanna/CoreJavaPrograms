package basicprograms;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();


		if(neonNumber(num)) {
			System.out.println(num + " is a neon number");
		}else {
			System.out.println(num +" is Not Neon Number");
		}
		
	}

	
	public static boolean neonNumber(int num) {
		int remainder = 0, result = 0;

		int sum = num * num;
		
		while (sum > 0) {
			remainder = sum % 10;
			result += remainder;
			sum = sum / 10;
		}
		
		if (num == result) {
			return true;
		} else {
			return false;
		}
	}

}
