package patterns;

import java.util.Scanner;
/**
 * This Class Print Numbers 
 * Sample Input - n = 4

1   
2   2   
3   3   3   
4   4   4   4 

 * @author prasa
 *
 */

public class PrintingRowNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printRowNumbers(n);
	}
	/**
	 * This Method Print Numbers 
	 * @param n NumberS
	 * 
	 */

	public static void printRowNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  " + i + " ");
			}
			System.out.println("  ");
		}
	}
}

/*
n = 4

1   
2   2   
3   3   3   
4   4   4   4 
*/