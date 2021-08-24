package patterns;

import java.util.Scanner;
/**
 * This Class Prints 
 * Sample Input - n = 4

	1  2  3  4  
	2  3  4  
	3  4  
	4  
 * @author prasa
 *
 */

public class PrintColums {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printColums(n);
	}
/**
 * This Method Prints Numbers
 * @param n - Number
 */
	public static void printColums(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" " + j + " ");
			}
			System.out.println(" ");
		}
	}

}
/*
n = 4
1  2  3  4  
2  3  4  
3  4  
4  
*/