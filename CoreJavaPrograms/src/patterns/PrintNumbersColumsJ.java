package patterns;

import java.util.Scanner;
/**
 * This Class Print Numbers
 * Sample Input - n = 4

1  
1  2  
1  2  3  
1  2  3  4 

 * @author prasa
 *
 */

public class PrintNumbersColumsJ {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printColumsJ(n);
	}
/**
 * This Method Print Number 
 * @param n - Number
 */
	public static void printColumsJ(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j + " ");
			}
			System.out.println(" ");
		}
	}
}

/*
n = 4

1  
1  2  
1  2  3  
1  2  3  4 
 
*/