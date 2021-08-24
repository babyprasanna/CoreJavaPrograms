package patterns;

import java.util.Scanner;
/**
 * This Class  Print IJ Matrix
 * Sample input - n = 4
 * 
   1 1  1 2  1 3  1 4  
   2 1  2 2  2 3  2 4  
   3 1  3 2  3 3  3 4  
   4 1  4 2  4 3  4 4 
 * @author prasa
 *
 */

public class PrintIJMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printMatrix(n);
	}
	/**
	 * This Method Print Matrix
	 * @param n - Number
	 */

	public static void printMatrix(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" " + i + " " + j + " ");
			}
			System.out.println(" ");
		}
	}
}
/*
n = 4
1 1  1 2  1 3  1 4  
2 1  2 2  2 3  2 4  
3 1  3 2  3 3  3 4  
4 1  4 2  4 3  4 4  
*/