package patterns;

import java.util.Scanner;
/**
 * This Class Prints Numbers
 * Sample Input - n = 4

1  2  3  4  
1  2  3  4  
1  2  3  4  
1  2  3  4  

 * @author prasa
 *
 */

public class PrintingNumberscolum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printColums(n);
	}
/**
 * This Method Print Numbers
 * @param n - Number
 */
	public static void printColums(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" " + j + " ");
			}
			System.out.println(" ");
		}
	}
}
/*
n = 4

1  2  3  4  
1  2  3  4  
1  2  3  4  
1  2  3  4  
*/