package patterns;

import java.util.Scanner;
/**
 * This Class Prints Numbers 0 - 30
 * Sample Input - n = 4

0  2  4  6  
8  10  12  14  
16  18  20  22  
24  26  28  30  
 * @author prasa
 *
 */

public class PrintEvenNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printEvenNumbers(n);
	}
/**
 * This Method Print Numbers
 * @param n Number
 */
	public static void printEvenNumbers(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" " + count + " ");
				count += 2;
			}
			System.out.println(" ");
		}
	}
}

/*
n = 4
0  2  4  6  
8  10  12  14  
16  18  20  22  
24  26  28  30  
*/