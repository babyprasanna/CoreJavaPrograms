package patterns;

import java.util.Scanner;
/**
 * This class prints " * "
 * Sample input - n = 4
 * 
    *  *  *  *
    *  *  *
    *  *
    *
 *  
 * @author prasa
 *
 */

public class PintRowLessN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printLowRow(n);
	}
/**
 * This Method Print " * "
 * 
 * @param n - Number
 */

	public static void printLowRow(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
/*
 n = 4
 *  *  *  *  
 *  *  *  
 *  *  
 *  
*/