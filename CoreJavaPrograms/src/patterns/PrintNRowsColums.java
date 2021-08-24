package patterns;

import java.util.Scanner;
/**
 * This Class Prints " * "
 * Sample Input - n = 4
 
 *  *  *  *  
 *  *  *  *  
 *  *  *  *  
 *  *  *  *  
 
 * @author prasa
 *
 */

public class PrintNRowsColums {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printRowsColumsN(n);

	}
	/**
	 * Thsi Method Print " * "
	 * 
	 * @param n - Number
	 */

	public static void printRowsColumsN(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		
	}

}
/*
 Ex O/P n = 4
 
 *  *  *  *  
 *  *  *  *  
 *  *  *  *  
 *  *  *  *  
 
*/
